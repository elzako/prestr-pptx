package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.exceptions.XmlException;

public class w2 {
   private c7 n5;
   private int l6;
   private int k5;
   private boolean u3;

   public final void n5() {
      if (this.l6 != 0) {
         while (this.n5(true)) {
         }

         if (this.l6 == 2) {
            if (this.n5.s7() != 15) {
               throw new XmlException(
                  "'{0}' is an invalid XmlNodeType.",
                  com.aspose.slides.ms.System.s3.n5(a4.class, this.n5.s7()),
                  com.aspose.slides.internal.v6g.k5.n5(this.n5, f0.class)
               );
            }

            this.n5.u9();
         }
      }

      this.l6();
   }

   public final void l6() {
      this.l6 = 0;
      this.u3 = false;
      this.k5 = 0;
   }

   private boolean n5(boolean var1) {
      do {
         switch (this.n5.s7()) {
            case 2:
               return !var1;
            case 3:
            case 4:
            case 13:
            case 14:
               if (!var1) {
                  return true;
               }
               break;
            case 5:
               if (!this.n5.z3()) {
                  return false;
               }

               this.n5.a0();
               break;
            case 6:
            case 9:
            case 10:
            case 11:
            case 12:
            case 15:
            default:
               return false;
            case 7:
            case 8:
            case 16:
         }

         var1 = false;
      } while (this.n5.u9());

      return false;
   }
}
