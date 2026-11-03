package com.aspose.slides.internal.s0;

import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.ms.System.t9;

public class n5 {
   private byte n5;
   private boolean l6;

   public n5() {
      this.n5();
   }

   public final void n5() {
      this.n5 = -1;
      this.l6 = false;
   }

   public final byte n5(char var1) {
      byte var2 = com.aspose.slides.internal.s0.l6.n5(var1);
      switch (var2) {
         case 0:
         case 1:
         case 32:
         case 36:
            var2 = 2;
            break;
         case 31:
            switch (t9.l6(var1)) {
               case 5:
               case 6:
                  var2 = 9;
                  break;
               default:
                  var2 = 2;
            }
      }

      switch (this.n5) {
         case -1:
            this.n5 = var2;
            if (k5.u3(this.n5, 6) == k5.u3((byte)9, 6)) {
               this.n5 = 2;
            }

            return 4;
         case 6:
         case 23:
         case 24:
            this.n5();
            this.n5 = var2;
            return 5;
         case 11:
            if (k5.u3(var2, 6) != k5.u3((byte)23, 6)) {
               this.n5();
               this.n5 = var2;
               return 5;
            }
         default:
            switch (var2) {
               case 6:
               case 11:
               case 23:
               case 24:
                  this.n5 = var2;
                  return 4;
               case 33:
                  this.l6 = true;
                  return 4;
               default:
                  boolean var3 = this.l6;
                  this.l6 = false;
                  byte var4 = com.aspose.slides.internal.s0.l6.n5(k5.u3(this.n5, 6), k5.u3(var2, 6));
                  switch (var4) {
                     case 0:
                     case 4:
                        this.n5 = var2;
                        return var4;
                     case 1:
                        this.n5 = var2;
                        if (var3) {
                           return 1;
                        }

                        return 4;
                     case 2:
                        if (var3) {
                           this.n5 = var2;
                           return 2;
                        }

                        return 4;
                     case 3:
                        if (var3) {
                           this.n5 = var2;
                        }

                        return 3;
                     default:
                        return var4;
                  }
            }
      }
   }
}
