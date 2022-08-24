import requests
x = requests.get('http://www.boredapi.com/api/activity/')
y=x.text
print(y)
# education", "recreational", "social", "diy", "charity", "cooking", "relaxation", "music", "busywork"
