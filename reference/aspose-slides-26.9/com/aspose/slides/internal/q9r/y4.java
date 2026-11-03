package com.aspose.slides.internal.q9r;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.l7h.a5;

public class y4 {
   private final byte[] n5;
   private int l6;
   private final Hashtable k5;
   private List<Double> u3 = new List<>();

   public y4(byte[] var1) {
      this.n5 = var1;
      this.k5 = new Hashtable();
   }

   public final Hashtable n5() {
      while (this.l6 < this.n5.length) {
         this.l6();
      }

      return this.k5;
   }

   private void l6() {
      byte[] var1 = new byte[5];
      var1[0] = this.u3();
      if ((var1[0] & 255) >= 0 && (var1[0] & 255) <= 21) {
         if ((var1[0] & 255) == 12) {
            this.k5.addItem(1200 + (this.u3() & 255), this.u3);
         } else {
            this.k5.addItem(var1[0] & 255, this.u3);
         }

         this.u3 = new List<>();
      } else if ((var1[0] & 255) == 30) {
         this.u3.addItem(this.k5());
      } else if ((var1[0] & 255) >= 32 && (var1[0] & 255) <= 246) {
         this.u3.addItem((double)((var1[0] & 255) - 139));
      } else {
         var1[1] = this.u3();
         if ((var1[0] & 255) >= 247 && (var1[0] & 255) <= 250) {
            this.u3.addItem((double)(((var1[0] & 255) - 247) * 256 + (var1[1] & 255) + 108));
         } else if ((var1[0] & 255) >= 251 && (var1[0] & 255) <= 254) {
            this.u3.addItem((double)(-1 * ((var1[0] & 255) - 251) * 256 - (var1[1] & 255) - 108));
         } else {
            var1[2] = this.u3();
            if ((var1[0] & 255) == 28) {
               this.u3.addItem((double)((short)((var1[1] & 255) << 8 | var1[2] & 0xFF)));
            } else {
               var1[3] = this.u3();
               var1[4] = this.u3();
               if ((var1[0] & 255) == 29) {
                  this.u3.addItem((double)((var1[1] & 255) << 24 | (var1[2] & 255) << 16 | (var1[3] & 255) << 8 | var1[4] & 0xFF));
               } else {
                  throw new ArgumentException("DICT operand does not fall in either of acceptable values.");
               }
            }
         }
      }
   }

   private double k5() {
      boolean var1 = false;
      a5 var2 = new a5();

      while (!var1) {
         int var3 = this.u3() & 255;
         int[] var4 = new int[]{(var3 & 240) >> 4, var3 & 15};

         for (int var5 = 0; var5 < 2; var5++) {
            if (var4[var5] >= 0 && var4[var5] <= 9) {
               var2.n5(com.aspose.slides.internal.z5z.t2.n5(var4[var5]));
            } else {
               switch (var4[var5]) {
                  case 10:
                     var2.n5(".");
                     break;
                  case 11:
                     var2.n5("E");
                     break;
                  case 12:
                     var2.n5("E-");
                     break;
                  case 13:
                     throw new ArgumentException("Reserved nibble value.");
                  case 14:
                     var2.n5("-");
                     break;
                  case 15:
                     var1 = true;
                     if (var5 == 0) {
                     }
               }
            }
         }
      }

      return com.aspose.slides.internal.z5z.t2.n5(var2.toString());
   }

   private byte u3() {
      return this.n5[this.l6++];
   }
}
