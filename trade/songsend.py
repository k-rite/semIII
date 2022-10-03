import pyautogui as pb
import time
a_file = open(r"C:\Users\krite\Documents\GitHub\semIII\trade\song.txt",'r')

lines = a_file.readlines()
for line in lines:
    pb.typewrite(line)
    time.sleep(1)
    pb.hotkey('enter')