import os
host,user,X = ["152.67.2.27","140.238.240.64"],["ubuntu","opc"],[r"C:\Users\krite\Downloads\ssh-key-2022-07-30.key",r"C:\Users\krite\Downloads\ssh-key-2022-09-01.key"]
n = int(input('1 for ADH | 2 for Oracle'))
cmd = f'''ssh -i "{X[n-1]}" {user[n-1]}@{host[n-1]}'''
os.system(cmd)