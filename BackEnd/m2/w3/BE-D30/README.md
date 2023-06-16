# BE-D30

GESTIONE INCENDI

Un sistema elettronico di rilevamento incendi utilizza la rete Internet (HTTP) per segnalare ad un centro di assistenza remoto la presenza di un incendio. In particolare, il sistema è distribuito tra il luogo dove la sonda è installata e il centro di controllo. Nel luogo di installazione, troviamo la sonda ed il processo che è costantemente in ascolto su di essa per captare il segnale di incendio. Ogni processo di controllo sonda può gestire una o più sonde e comunicare gli allarmi al centro di controllo. Nel centro di controllo, troviamo invece le componenti che operano le operazioni necessarie per allertare il personale competente del pericolo. Le informazioni che devono essere disponibili al personale competente devono essere le coordinate geografiche (latitudine e longitudine) della sonda e la quantità di fumo percepita dalla sonda. Se il livello di fumo impostato per la sonda è maggiore di 5, deve scattare l'allarme. Per notificare gli eventi al personale è necessario invocare una apposita URL
(http://host/alarm?=idsonda=[idSonda]&lat=[latitude]&lon=[longitude]&smokelevel=[smokeLevel]. Poiché il sistema è ancora in sperimentazione, si vuole dare la possibilità di modificare in futuro il canale di comunicazione
tra la sonda e il centro di controllo.

Si implementi il modello associato all'applicazione descritta facendo uso, dove possibile, dei design patterns.
