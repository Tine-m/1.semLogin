# 1.semLogin

Programmet blev til kollektivt ved en kodestafet, og illustrerer brugen af
- packages til at inddele et program i de tre overordende ansvarsområder: userinterface (kommunikation med brugeren(, applikations- og domænelogik (f.eks. beregn totalpris for ordre), samt data source (fil-skrivning/-læsning)
- interface til at skabe en kontrakt for en data source handler, således at implementering af filhåndtering kan udskiftes efter behov.
