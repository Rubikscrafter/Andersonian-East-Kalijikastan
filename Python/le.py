'''
Takes in a number and returns the factorial of such a number

Assumes the number is positive
'''
def fact(x):
    if (x == 1):
        return 1;
    else:
        return fact(x-1)*x;


def main():
    try:
        x = int(input('What number would you like to take the factorial of?\n'))
    except:
        print('Please enter a valid positive integer.\n')
        main()
    else:
        print(fact(x))


if __name__ == '__main__':
    main()
