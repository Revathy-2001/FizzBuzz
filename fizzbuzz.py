lst = list(input().split())
x = int(lst[0])
y = int(lst[1])
n = int(lst[2])
i = 1
while(i <= n):
  if(i % x == 0 and i % y == 0):
    print("FizzBuzz");
  elif(i % x == 0):
    print("Fizz");
  elif(i % y == 0):
    print("Buzz");
  else:
   print(i);
  i+=1