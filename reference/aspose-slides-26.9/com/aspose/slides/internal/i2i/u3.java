package com.aspose.slides.internal.i2i;

import com.aspose.slides.ms.System.d1;

public class u3 {
   private k5 n5;
   private k5 l6 = new k5();
   private l6 k5;
   private k5 u3;
   private int a6;

   public u3() {
   }

   public u3(k5 var1) {
      this();
      this.u3 = new k5();
      this.u3.n5(var1);
   }

   public int n5() {
      return this.a6;
   }

   public k5 l6() {
      if (this.n5 == null) {
         this.n5 = new k5();
         this.n5.n5(h0.a6());
         return this.n5;
      } else {
         return this.n5;
      }
   }

   public boolean n5(l6 var1) {
      this.a6 = 0;
      if (this.u3 == null) {
         this.u3 = new k5();
         l6 var2 = var1;
         l6 var3 = var2;

         while (var2 != null && !var2.q0()) {
            var3 = var2;
            this.u3.n5(var2);
            var2 = this.k5(var2);
         }

         this.k5 = this.u3(var3);
      } else {
         int var4 = this.u3.size();
         if (var4 > 0) {
            if (this.n5(var1, this.u3.n5(0))) {
               int var6 = 1;

               while (var6 < var4 && this.n5(this.u3.n5(var6 - 1), this.u3.n5(var6))) {
                  var6++;
               }

               if (var6 == var4) {
                  this.k5 = this.u3(this.u3.n5(var4 - 1));
               }
            }
         } else {
            this.k5 = this.u3(var1);
         }
      }

      if (this.u3 != null && this.a6 == 0) {
         for (Object recoveredElement$var7$1436 : this.u3) {
            l6 var7 = (l6)recoveredElement$var7$1436;
            if (!this.l6(var7)) {
               return false;
            }
         }

         if (!this.l6(var1)) {
            if (this.a6 == 2) {
               this.a6 = 1;
            }

            return false;
         }

         if (this.k5 != null && !this.l6(this.k5)) {
            return false;
         }
      }

      return this.a6 == 0;
   }

   private boolean l6(l6 var1) {
      if (!var1.t4()) {
         this.a6 = 2;
         return false;
      } else {
         return true;
      }
   }

   private l6 k5(l6 var1) {
      for (Object recoveredElement$var3$2014 : this.l6) {
         l6 var3 = (l6)recoveredElement$var3$2014;
         if (this.n5(var1, var3)) {
            return var3;
         }
      }

      return null;
   }

   private l6 u3(l6 var1) {
      if (var1 == null) {
         this.a6 = 65536;
         return null;
      }

      if (this.a6(var1)) {
         return var1;
      }

      for (Object recoveredElement$var3$2321 : this.l6()) {
         l6 var3 = (l6)recoveredElement$var3$2321;
         if (this.n5(var1, var3)) {
            return var3;
         }
      }

      if (var1.q0()) {
         this.a6 = 32;
         return var1;
      } else {
         this.a6 = 65536;
         return null;
      }
   }

   private boolean a6(l6 var1) {
      return this.l6().l6(var1);
   }

   private boolean n5(l6 var1, l6 var2) {
      if (!d1.l6(var1.u3(), var2.m1())) {
         return false;
      }

      if (var2.z1() > 2 && !this.a6(var2)) {
         a6 var3 = var2.l6().l6("2.5.29.19");
         if (var3 != null) {
            com.aspose.slides.internal.b5x.a6 var4 = new com.aspose.slides.internal.b5x.a6(var3);
            if (!var4.u9()) {
               this.a6 = 1024;
            }
         } else {
            this.a6 = 1024;
         }
      }

      if (!var1.l6(var2.c8())) {
         this.a6 = 8;
         return false;
      } else {
         return true;
      }
   }
}
