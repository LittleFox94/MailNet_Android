MailNet_Android
===============

Social network over e-mail - Control your data and use standards! Android/Reference implementation


What is MailNet?
================

Google+, Facebook, Twitter and all the other big social networks have some problems, by example
 - What happens whith my data when these go offline?
 - How to prevent the company behind these services to use my data?
 - How to secure my posts against secret services?

MailNet tries to fix these issues by encrypting your posts and storing them as e-mails in a humand-readable form.
You can use your own mailserver or one of the hundreds of ISPs worldwide. Because the posts are encrypted there
is no way for the ISPs to use them.

When there aren't any usable MailNet-Clients in the future (I doubt it when some people still use it), you can
read your e-mails to view the old posts, although there will be some features missing - such as filtering friends/all
or liking and commenting.


How does it work?
=================

MailNet is currently in development - there is not a complete specification at the moment.
Altough there are some things still fixed in my head, an now in the README:
 - encryption will be PGP/GnuPG
 - sending a post is encrypting the message for all your friends and sending it via e-mail to them
 - commenting is sending a reply back to the poster and to all his friends/people who can see that post
 - liking is a special comment.
 - MailNet-specific data is stored in the e-mail headers. That way it doesn't confuse people using their mail-client to read posts.


Problems/Disadvantages
======================

Sadly I have to say there are some disadvantages with the current concept. First of all E-Mail-headers can't be encrypted
(how to deliver them?) so it is possible for your ISP to see your friends.
Secondly, because comments and likes are mails which are sent to everyone who can see that post your friends can see who are your
friends or who is allowed to see a post. Maybe a "stealth-mode" is possible by sending these mails only to the author and sharing them when the author is online again.


Other
=====

It was a quick idea at a weekend while washing the dishes - so please don't blame me to much if it is bad^^

Please don't make forks that introduce incompatible changes, instead send an email to me and we find a solution. Many different
versions aren't good for anybody.
Ideas, constructive criticism and help in implementing is very welcome. I can only do this in my spare time,
so don't expect something usable in the next time.


      -- LittleFox (littlefox@lf-net.org) @ 2013/07/27 at 23:25 while listening to gooood Music (ASP, Blutengel, (old) Unheilig)^^

