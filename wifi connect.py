import pyautogui as pg
import time

def tracker():
    #pg.hotkey('ctrl','alt','c')
    pg.click(x=1720, y=1051)
    time.sleep(1)
    pg.click(x=1571, y=576)
    time.sleep(5)
    pg.click(x=1566,y=653)
    time.sleep(2)
    pg.click(x=916,y=713)
    time.sleep(1)
    pg.click(x=1070,y=740)
    pg.press("Enter")

tracker()
import pyautogui, sys
print('Press Ctrl-C to quit.')
try:
    while True:
        x, y = pyautogui.position()
        positionStr = 'X: ' + str(x).rjust(4) + ' Y: ' + str(y).rjust(4)
        print(positionStr, end='')
        print('\b' * len(positionStr), end='', flush=True)
except KeyboardInterrupt:
    print('\n')
#X:  957 Y:  651 | gmail
#X: 1720 Y: 1051
#x: 