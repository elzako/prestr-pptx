package com.aspose.slides.internal.k0r;

public class c5 extends r4 {
   public c5() {
      this.w1().n5(1033);
   }

   public d9 l6() {
      return (d9)this.k5(1034);
   }

   public x3 n5(long var1) {
      for (int var3 = 0; var3 < this.e2().size(); var3++) {
         Object var4 = this.e2().get_Item(var3);
         x3 var5 = var4 instanceof x3 ? (x3)var4 : null;
         if (var5 != null && var5.u3() != null && var5.u3().k5() == var1) {
            return var5;
         }
      }

      return null;
   }

   public r7 l6(long var1) {
      for (int var3 = 0; var3 < this.e2().size(); var3++) {
         r7 var4 = null;
         if (this.e2().get_Item(var3) instanceof n7 || this.e2().get_Item(var3) instanceof r5 || this.e2().get_Item(var3) instanceof y9) {
            if (this.e2().get_Item(var3) instanceof n7) {
               var4 = ((n7)this.e2().get_Item(var3)).l6();
            } else if (this.e2().get_Item(var3) instanceof r5) {
               var4 = ((r5)this.e2().get_Item(var3)).l6();
            } else if (this.e2().get_Item(var3) instanceof y9) {
               var4 = ((y9)this.e2().get_Item(var3)).l6();
            }

            if (var4 != null) {
               u2 var5 = var4.l6();
               if (var5 != null && var5.l6() == var1) {
                  return var4;
               }
            }
         }
      }

      return null;
   }

   public r4 k5(long var1) {
      for (int var3 = 0; var3 < this.e2().size(); var3++) {
         if (this.e2().get_Item(var3) instanceof h1) {
            h1 var4 = (h1)this.e2().get_Item(var3);
            u2 var5 = var4.l6();
            if (var5 != null && var5.l6() == var1) {
               return var4;
            }
         } else if (this.e2().get_Item(var3) instanceof a2) {
            a2 var6 = (a2)this.e2().get_Item(var3);
            u2 var7 = var6.l6();
            if (var7 != null && var7.l6() == var1) {
               return var6;
            }
         }
      }

      return null;
   }

   public r4 u3(long var1) {
      for (int var3 = 0; var3 < this.e2().size(); var3++) {
         if (this.e2().get_Item(var3) instanceof l5) {
            l5 var4 = (l5)this.e2().get_Item(var3);
            u2 var5 = var4.l6();
            if (var5 != null && var5.l6() == var1) {
               return var4;
            }
         }
      }

      return null;
   }

   public r4 a6(long var1) {
      for (int var3 = 0; var3 < this.e2().size(); var3++) {
         if (this.e2().get_Item(var3) instanceof w3) {
            w3 var4 = (w3)this.e2().get_Item(var3);
            u2 var5 = var4.l6();
            if (var5 != null && var5.l6() == var1) {
               return var4;
            }
         }
      }

      return null;
   }

   public d6 u9(long var1) {
      for (int var3 = 0; var3 < this.e2().size(); var3++) {
         Object var4 = this.e2().get_Item(var3);
         d6 var5 = var4 instanceof d6 ? (d6)var4 : null;
         if (var5 != null && var5.l6() != null && var5.l6().l6() == var1) {
            return var5;
         }
      }

      return null;
   }
}
