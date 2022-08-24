import cv2
import time
import pyautogui as pg
pg.click(pg.locateOnScreen('1.jpg', confidence=0.9))
time.sleep(2.3)
pg.click(x=1561, y=550)
time.sleep(1)
pg.click(pg.locateOnScreen('3.jpg', confidence=0.9))
time.sleep(1.5)
pg.click(pg.locateOnScreen('4.jpg', confidence=0.9))
time.sleep(8)
pg.click(x=970, y=707)
time.sleep(1.5)
pg.click(pg.locateOnScreen('6.jpg', confidence=0.9))
pg.hotkey("Enter")