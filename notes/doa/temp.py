import pyautogui as pb
import time
file1 = open(r'C:\Users\krite\Documents\GitHub\semIII\notes\doa\tempp.txt', encoding="utf8")
time.sleep(5)

while True:
  
    # Get next line from file
    msg = str(file1.readline())
    print(msg)
    pb.typewrite(msg)
    pb.press("enter")
    if not msg:
        break
