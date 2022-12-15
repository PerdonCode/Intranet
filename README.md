# Intranet

Ik ga een webshop maken( over ?) waarbij de nadruk eigenlijk ligt op alles wat achter een bedrijf zit de onderdelen vind je hieronder opgesteld.

moet nog bedenken wat de verhouding word tussen bepaalde afdelingen, zoals afdelingen die elkaar controleren of juist aansturen.

Via de login die te vinden is op www.PerdonCode.com/login kom je terrecht op de homepage vanwaar je naar de volgende directies kunt toe navigeren door op de button te klikken. 

voor elke medewerker is de homepage anders want een magazijn medewerker hoort niks te maken hebben met de diensten van een IT specialist dit voorkomt verwarring en houd het overzichtelijk.

voor de login ga ik een role-basedspring-security login maken die elke gebruiken naar zijn eigen dashboard stuurt met gebruik van onderstaande database model.
![database-design](https://user-images.githubusercontent.com/118398079/206561903-bf2193dd-069c-49a0-884a-3fa0fac293dd.png)


magazijn medewerker:
 - barcode kunnen scannen om vervolgends de binnengekomen order te controleren of het compleet is.
 - overzicht van orders die zijn binnengekomen van (afdeling ?) of online store. 
 - manager moet producten kunnen bijbestellen. 

finance:
 - declaratie in behandeling nemen bij een bedrag horen dan 100 euro moet die gecontroleerd worden door manager van de desbetreffende afdeling
 - salaris in systeem zetten met controle CEO. waaruit vervolgens een salaris strookje uit onstaat.
 - 

it support/ it security:
 - nieuwe inlog gegevens kunnen aanmaken voor nieuwe medewerkers.
 - wachtwoord resetten naar prive mail(geen werkmail) versturen naar desbetreffende medewerker die zijn wachtwoord is vergeten. 
 - verdere taken bedenken

marketing sales:
- nog bedenken hoe ik dit kan verwerken in het systeem.

HR:
 - schrijven van vacatureteksten wat vervolgens op de site komt onder het kopje werken bij.
 - opstellen vernieuwen en of beeindigen aarbeidsovereenkomsten.
 - bijhouden van sollicitaties.

Client support: 
 - aantekeningen maken van klant en de problemen doorsturen naar de juiste afdeling. mits de support medewerker het niet zelf kan oplossen.
 - ontevereden klanten eventueel een coupon code kunnen aanbieden van bepaald percentage of bedrag. 
  

hamburger menu met de opties.
iedereen:
 - salaris strook
 - rooster? (iedereen vaak vaste dagen 9-5)
 - declarie kunnen indienen.
 - vrij vragen.
 
manager: 
  - vrij aanvragen goedkeuren
  - taken verdelen onder de afdeling
  - doelen opstellen
 
 medewerker:
 - vrij kunnen vragen 
 - overzicht toegekregen taken
 
 
 Bij een groot bedrijf zal de CEO niet de mensen aannemen maar om het niet al te ingewikkeld te maken zal het in dit geval wel zo zijn.
 CEO:
- crud producten 
- mensen ontslaan / aannemen 
- Overzicht hoe het in een bepaalde periode is gegaan kwa sales en kosten en of doelen zijn gehaald door middel van grafieken.

ADD EMPLOYEE
door het in te vullen van voornaam, achternaam en afdeling word er automatisch een mail aangemaakt en een random password gegenereerd
naam: Niels
achternaam: perdon
afdeling: sales
email : niels.perdon-sales@PerdonCode.com
pasword: ***********

vervolgens moet de nieuwe employee zelf de resterende persoonlijke informatie toebogen via zijn of haar profiel.

afdeling labels moeten in verband staan met elkaar
dus waneer er als afdeling sales is uitgekozen 
kan er bij User_Role alleen gekozen worden uit sales of manager_sales

bij de normale functie en de manager functie word of functie gelijk een salaris in de database gezet.
de standaard salaris voor sales is bijvoorbeeld : 2750
en voor de manager : 3750
in dit geval zal de nieuwe employee een salaris hebben van 2750

 



                .antMatchers("/").permitAll()
                .antMatchers("/magazijn").hasRole("MAGAZIJN")
                .antMatchers("/M_magazijn").hasRole("MANAGER_MAGAZIJN")
                .antMatchers("/finance").hasRole("FINANCE")
                .antMatchers("/M_finance").hasRole("MANAGER_FINANCE")
                .antMatchers("/it").hasRole("IT")
                .antMatchers("/M_it").hasRole("MANAGER_IT")
                .antMatchers("/marketing").hasRole("MARKETING")
                .antMatchers("/M_marketing").hasRole("MANAGER_MARKETING")
                .antMatchers("/hr").hasRole("HR")
                .antMatchers("/M_hr").hasRole("MANAGER_HR")
                .antMatchers("/support").hasRole("SUPPORT")
                .antMatchers("/M_support").hasRole("MANAGER_SUPPORT")
