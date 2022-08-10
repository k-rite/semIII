import cv2
import time
import pyautogui as pg
a = pg.locateOnScreen('1.jpg', confidence=0.9)
pg.click(a)
time.sleep(1)
pg.click(x=1561,y=550)
time.sleep(1)
b = pg.locateOnScreen('3.jpg', confidence=0.9)
pg.click(b)
time.sleep(1.5)
c = pg.locateOnScreen('4.jpg', confidence=0.9)
pg.click(c)
time.sleep(8)
pg.click(x=970,y=707)
time.sleep(2)
d = pg.locateOnScreen('6.jpg', confidence=0.9)
pg.click(d)
time.sleep(1)
pg.hotkey("Enter")
# import pyautogui as pg
# import time

# import pyautogui 
# print('Press Ctrl-C to quit.')
# try:
#     while True:
#         x, y = pyautogui.position()
#         positionStr = 'X: ' + str(x).rjust(4) + ' Y: ' + str(y).rjust(4)
#         print(positionStr, end='')
#         print('\b' * len(positionStr), end='', flush=True)
# except KeyboardInterrupt:
#     print('\n')
# X:  957 Y:  651 | gmail
# X: 1720 Y: 1051
# x: 580