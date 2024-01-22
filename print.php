<?php
                    for ($i=0; $i < count($result); $i++) { 
                        echo "<div class='dbOutput'>";
                        echo "<h2>".$result[$i]['berufsbezeichnung']."</h2>";
                        echo "<p style='color:darkblue;'><strong>Anforderungen:</strong></p>";
                        echo "<p>".$result[$i]['anforderungen']."</p>";
                        echo "<br>";
                        echo "<p style='color:darkblue;'><strong>Aufgabenbereich:</strong></p>";
                        echo "<p>".$result[$i]['aufgabenbereich']."</p>";
                        echo "<br>";
                        echo "<p style='color:darkblue;'><strong>Benefits:</strong></p>";
                        echo "<p>".$result[$i]['benefits']."</p>";
                        echo "<br>";
                        echo "<p style='color:darkblue;'><strong>Bezahlung:</strong></p>";
                        echo "<p>".$result[$i]['bezahlung']."€ Brutto/Monat</p>";
                        echo "</div>";
                        
                        
                    }
                    //Ausgabe der Inserate
?>