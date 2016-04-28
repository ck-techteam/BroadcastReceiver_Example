<article class="markdown-body entry-content" itemprop="text">
<h1><a id="BroadCastReceiver" class="anchor" href="#BroadCastReceiver" aria-hidden="true"></a>BroadCastReceiver</h1>

<p>
Android broadcastreceiver is also a component where you can register for system or application events. You will be notified about the events after registering. Broadcast originates from the system as well as applications. For example, an Instance for broadcast originating from the system is ‘low battery notification’. 
It means ACTION_BATTERY_LOW event has been registered and the Android system fires it when the battery level goes down. Incoming message notifications, wifi notifications all are broadcast receivers.
</p>

<h3>
Create your Broadcast 
</h3>
<p>
A broadcast receiver extends BroadcastReceiver class. Which means that we have to implement the onReceive() method of this base class. Whenever the event occurs Android calls the onReceive() method on the registered broadcast receiver. For example, if you register for ACTION_POWER_CONNECTED event then whenever power got connected to the device, your broadcast receiver’s onReceive() method will be invoked.
</p>

<h3>
onReceive() Method
</h3>
<p>
The onReceive() method takes two arguments. onReceive(Context context,Intent intent)
context can be used to start services or activities and the intent is the object used to register your receiver. The intent can contain additional information you can use in your implementation.
</p>

<h4>
Description:\
</h4>
<p>
In this Project we will see how to implement a broadcast receiver for android phone state change. When your phone state is changed, you will create a notification. 
</p>
<ul>
<li>Step 1:First register your receiver in manifest file with the intent filter. Similar to activity , receiver should also be declared in manifest file.
<br><br>
<img src="http://armorappz.com/github/manifest.png">
</li>


<li>Step 2: Create a xml file to start the receiver with button. Place a button so that when you click it, you can start the receiver.
<br><br>
<img src="http://armorappz.com/github/maindesign.png">
</li>


<li>Step 3:  Implement the Mainactivity.class to obtain the button click and start the receiver. Then on Button click, the receiver will get activated.  When a phone state is changed, you will be informed with a message.
<br><br>
<img src="http://armorappz.com/github/MainActivity.png">
</li>


<li>Step 4: Then implement the receiver class so that the receiver gets activated. When a phone state change is received, the values will be received in onReceive method and message will be displayed as mobile number and name. That’s it. Broadcast receiver is done.
<br><br>
<img src="http://armorappz.com/github/Receiver.png">
</li>
</ul>
</article>
