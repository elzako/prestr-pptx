package com.aspose.slides.internal.b5x;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.p8;

public class n5 extends com.aspose.slides.internal.i2i.a6 {
   private ArrayList u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "1.3.6.1.5.5.7.3.1", "1.3.6.1.5.5.7.3.2", "1.3.6.1.5.5.7.3.3", "1.3.6.1.5.5.7.3.4", "1.3.6.1.5.5.7.3.8", "1.3.6.1.5.5.7.3.9"
   );

   public n5() {
      this.n5 = "2.5.29.37";
      this.u3 = new ArrayList();
   }

   public n5(com.aspose.slides.internal.i2i.a6 var1) {
      super(var1);
   }

   @Override
   protected void n5() {
      this.u3 = new ArrayList();
      com.aspose.slides.internal.x8w.l6 var1 = new com.aspose.slides.internal.x8w.l6(this.k5.u3());
      if (com.aspose.slides.internal.v6g.k5.u3(var1.l6(), 6) != 48) {
         throw new ArgumentException("Invalid ExtendedKeyUsage extension");
      }

      for (int var2 = 0; var2 < var1.n5(); var2++) {
         this.u3.addItem(com.aspose.slides.internal.x8w.k5.l6(var1.n5(var2)));
      }
   }

   @Override
   protected void l6() {
      com.aspose.slides.internal.x8w.l6 var1 = new com.aspose.slides.internal.x8w.l6((byte)48);

      for (Object recoveredElement$var3$1329 : this.u3) {
         String var3 = (String)recoveredElement$var3$1329;
         var1.n5(com.aspose.slides.internal.x8w.k5.n5(var3));
      }

      this.k5 = new com.aspose.slides.internal.x8w.l6((byte)4);
      this.k5.n5(var1);
   }

   public ArrayList u9() {
      return this.u3;
   }

   @Override
   public String toString() {
      a5 var1 = new a5();

      for (Object recoveredElement$var3$1655 : this.u3) {
         String var3 = (String)recoveredElement$var3$1655;
         switch (a6.n5(var3)) {
            case 0:
               var1.n5("Server Authentication");
               break;
            case 1:
               var1.n5("Client Authentication");
               break;
            case 2:
               var1.n5("Code Signing");
               break;
            case 3:
               var1.n5("Email Protection");
               break;
            case 4:
               var1.n5("Time Stamping");
               break;
            case 5:
               var1.n5("OCSP Signing");
               break;
            default:
               var1.n5("unknown");
         }

         var1.n5(" ({0}){1}", var3, p8.k5());
      }

      return var1.toString();
   }
}
