import requests

url = 'https://hooks.airtable.com/workflows/v1/genericWebhook/appELabLuXHytztdt/wflu20Gbqso5IB1xK/wtrQldVNfIhFzY9mr'
myobj = {'Discord ID': 'somevalue','Discord Name': ' '}

x = requests.post(url, json = myobj)

print(x.text)
