package com.aspose.slides.internal.y7;

import java.math.BigInteger;

public final class u3 {
   private Object n5;
   private int l6;
   private h0 k5;
   private boolean u3;

   u3(h0 var1, boolean var2) throws a6 {
      this.k5 = var1;
      this.u3 = var2;
   }

   public static u3$n5<k5> n5() {
      return new u3$n5<>(k5.class);
   }

   <T> T n5(Class<T> var1) throws a6 {
      this.k5();
      Object var2 = this.l6();
      if (this.k5() != 0) {
         throw this.k5.n5(null, "Expected end of input, got " + this.l6, true);
      } else if (var1 == Object.class || var2 != null && var1.isAssignableFrom(var2.getClass())) {
         return (T)var1.cast(var2);
      } else {
         throw this.k5.n5(null, "JSON did not contain the correct type, expected " + var1.getSimpleName() + ".", true);
      }
   }

   private Object l6() throws a6 {
      if (this.l6 >= 5) {
         return this.n5;
      } else {
         throw this.k5.n5(null, "Expected JSON value, got " + this.l6, true);
      }
   }

   private int k5() throws a6 {
      this.l6 = this.k5.l6();
      switch (this.l6) {
         case 5:
            this.n5 = null;
            break;
         case 6:
            this.n5 = Boolean.TRUE;
            break;
         case 7:
            this.n5 = Boolean.FALSE;
            break;
         case 8:
            this.n5 = this.k5.n5.toString();
            break;
         case 9:
            if (this.u3) {
               this.n5 = new l6(this.k5.n5.toString(), this.k5.l6);
            } else {
               this.n5 = this.u3();
            }
            break;
         case 10:
            k5 var2 = new k5();
            if (this.k5() != 3) {
               while (true) {
                  if (this.l6 != 8) {
                     throw this.k5.n5(null, "Expected STRING, got " + this.l6, true);
                  }

                  String var3 = (String)this.n5;
                  if (this.k5() != 2) {
                     throw this.k5.n5(null, "Expected COLON, got " + this.l6, true);
                  }

                  this.k5();
                  var2.put(var3, this.l6());
                  if (this.k5() == 3) {
                     break;
                  }

                  if (this.l6 != 1) {
                     throw this.k5.n5(null, "Expected a comma or end of the object instead of " + this.l6, true);
                  }

                  if (this.k5() == 3) {
                     throw this.k5.n5(null, "Trailing object found in array", true);
                  }
               }
            }

            this.n5 = var2;
            return this.l6 = 10;
         case 11:
            n5 var1 = new n5();
            if (this.k5() != 4) {
               while (true) {
                  var1.add(this.l6());
                  if (this.k5() == 4) {
                     break;
                  }

                  if (this.l6 != 1) {
                     throw this.k5.n5(null, "Expected a comma or end of the array instead of " + this.l6, true);
                  }

                  if (this.k5() == 4) {
                     throw this.k5.n5(null, "Trailing comma found in array", true);
                  }
               }
            }

            this.n5 = var1;
            return this.l6 = 11;
      }

      return this.l6;
   }

   private Number u3() throws a6 {
      String var1 = this.k5.n5.toString();

      try {
         if (this.k5.l6) {
            return Double.parseDouble(var1);
         } else if (var1.length() == 1) {
            return var1.charAt(0) - '0';
         } else if (var1.length() == 2 && var1.charAt(0) == '-') {
            return '0' - var1.charAt(1);
         } else {
            boolean var2 = var1.charAt(0) == '-';
            int var3 = var2 ? var1.length() - 1 : var1.length();
            if (var3 >= 10 && (var3 != 10 || var1.charAt(var2 ? 1 : 0) >= '2')) {
               return var3 >= 19 && (var3 != 19 || var1.charAt(var2 ? 1 : 0) >= '9') ? new BigInteger(var1) : Long.parseLong(var1);
            } else {
               return Integer.parseInt(var1);
            }
         }
      } catch (NumberFormatException var4) {
         throw this.k5.n5(var4, "Malformed number: " + var1, true);
      }
   }
}
