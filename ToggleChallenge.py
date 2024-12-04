def find_possible_digits(valid_digit_map, faulty_segment):   
    possible_digits = []
    for digit, valid in valid_digit_map.items():     
        diff = sum(1 for a, b in zip(faulty_segment, valid) if a != b)
        if diff == 0:
            possible_digits.append(digit)
        elif diff == 1:  
            possible_digits.append(digit)
    return possible_digits


def solve():    
    segment_display = [input().strip() for _ in range(3)]  

    faulty_display = [input().strip() for _ in range(3)]   
   
    valid_digit_map = {}
    for i in range(10):
        valid_digit_map[i] = ''.join(segment_display[j][i*3:(i+1)*3] for j in range(3))   
   
    faulty_number_segments = []
    for i in range(len(faulty_display[0]) // 3):
        faulty_segment = ''.join(faulty_display[j][i*3:(i+1)*3] for j in range(3))
        possible_digits = find_possible_digits(valid_digit_map, faulty_segment)
        if not possible_digits:
            print("Invalid", end='')
            return
        faulty_number_segments.append(possible_digits) 

    from itertools import product
    total_sum = 0
    for possible_digits_combination in product(*faulty_number_segments):
        total_sum += int(''.join(map(str, possible_digits_combination)))    
    print(total_sum, end='')

solve()
