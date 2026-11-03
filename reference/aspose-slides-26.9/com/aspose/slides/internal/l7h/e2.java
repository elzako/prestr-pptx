package com.aspose.slides.internal.l7h;

public class e2 extends a6 {
   public e2() {
      super(51932, 932);
   }

   @Override
   protected boolean n5(int[] var1) {
      if (var1[0] >= 256) {
         if (var1[0] >= 64064 && var1[0] <= 64587) {
            if (var1[0] >= 64064 && var1[0] <= 64091) {
               if (var1[0] <= 64073) {
                  var1[0] -= 2897;
               } else if (var1[0] >= 64074 && var1[0] <= 64083) {
                  var1[0] -= 29430;
               } else if (var1[0] >= 64084 && var1[0] <= 64087) {
                  var1[0] -= 2907;
               } else if (var1[0] == 64088) {
                  var1[0] = 34698;
               } else if (var1[0] == 64089) {
                  var1[0] = 34690;
               } else if (var1[0] == 64090) {
                  var1[0] = 34692;
               } else if (var1[0] == 64091) {
                  var1[0] = 34714;
               }
            } else if (var1[0] >= 64092 && var1[0] <= 64587) {
               byte var2 = (byte)var1[0];
               if ((var2 & 255) < 92) {
                  var1[0] -= 3423;
               } else if ((var2 & 255) >= 128 && (var2 & 255) <= 155) {
                  var1[0] -= 3357;
               } else {
                  var1[0] -= 3356;
               }
            }
         }

         byte var4 = (byte)(var1[0] >> 8);
         byte var3 = (byte)var1[0];
         var4 = (byte)((var4 & 255) - (((var4 & 255) > 159 ? -79 : 113) & 0xFF));
         var4 = (byte)(((var4 & 255) << 1) + 1);
         if ((var3 & 255) > 158) {
            var3 = (byte)((var3 & 255) - 126);
            var4++;
         } else {
            if ((var3 & 255) > 126) {
               var3--;
            }

            var3 = (byte)((var3 & 255) - 31);
         }

         var1[0] = (var4 & 255) << 8 | var3 & 255 | 32896;
         if ((var1[0] & 0xFF00) < 41216 || (var1[0] & 0xFF00) > 65024 || (var1[0] & 0xFF) < 161 || (var1[0] & 0xFF) > 254) {
            return false;
         }
      } else {
         if (var1[0] >= 161 && var1[0] <= 223) {
            var1[0] |= 36352;
            return true;
         }

         if (var1[0] >= 129 && var1[0] != 160 && var1[0] != 255) {
            return false;
         }
      }

      return true;
   }

   @Override
   protected void n5(char[] var1) {
      for (int var2 = 161; var2 <= 254; var2++) {
         var1[var2] = '\ufffe';
      }

      var1[142] = '\ufffe';
   }
}
