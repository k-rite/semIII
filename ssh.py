import os
response = int(input('Enter which server you want to acces | 1 for Adh and 2 for Oracle'))
if response == 1:
    host ="152.67.2.27"
    user="ubuntu"
    X=r"C:\Users\krite\Downloads\ssh-key-2022-07-30.key"
elif response == 2:
    host ="140.238.240.64"
    user="opc"
    X=r"C:\Users\krite\Downloads\ssh-key-2022-09-01.key"
cmd = f'''ssh -i "{X}" {user}@{host}'''
os.system(cmd)