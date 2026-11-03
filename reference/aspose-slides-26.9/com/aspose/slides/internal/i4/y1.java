package com.aspose.slides.internal.i4;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.ArgumentException;

public abstract class y1 extends g7 implements IGenericEnumerable<KeyValuePair<String, g7>> {
   private boolean n5;
   private boolean u3;
   private int a6 = 0;
   private y1 u9;
   public o5 l6 = new r8();

   public final void l6(boolean var1) {
      this.n5 = var1;
   }

   public int k5() {
      return this.a6;
   }

   public void n5(int var1) {
   }

   private y1 s7() {
      return this.u9;
   }

   private void k5(y1 var1) {
      this.u9 = var1;
   }

   public boolean u3(String var1) {
      y1 var2 = this;

      while (!var2.k5(var1)) {
         var2 = var2.s7();
         if (var2 == l5.n5 || var2 == y5.n5) {
            return false;
         }
      }

      return true;
   }

   public boolean k5(String var1) {
      y2 var2 = null;
      y2[] var3 = new y2[]{var2};
      boolean var4 = this.l6.n5(var1, var3) && var3[0].a6() == this;
      var2 = var3[0];
      return var4;
   }

   public boolean l6(g7 var1) {
      return this.u3(var1.toString());
   }

   public boolean k5(g7 var1) {
      return this.k5(var1.toString());
   }

   public y2 a6(String var1) {
      y2 var2 = null;
      y2[] var3 = new y2[]{var2};
      boolean var4 = this.l6.n5(var1, var3);
      var2 = var3[0];
      if (var4) {
         if (!var2.u9()) {
            return var2;
         }

         this.l6.n5(var1);
      }

      if ((var2 = this.s7().a6(var1)) != null) {
         this.l6.n5(var1, var2);
      }

      return var2;
   }

   public boolean n5(String var1, y2[] var2) {
      var2[0] = this.a6(var1);
      return var2[0] != null;
   }

   public boolean n5(String var1, g7[] var2) {
      y2 var3 = this.a6(var1);
      if (var3 == null) {
         var2[0] = l5.n5;
         return false;
      } else {
         var2[0] = var3.n5(this);
         return true;
      }
   }

   public g7 n5(g7 var1) {
      return this.n5(var1.toString());
   }

   public void n5(g7 var1, g7 var2) {
      this.n5(var1.toString(), var2);
   }

   public g7 n5(String var1) {
      y2 var2 = this.a6(var1);
      return var2 != null ? var2.n5(this) : l5.n5;
   }

   public void n5(String var1, g7 var2) {
      y2 var3 = this.a6(var1);
      if (var3 != null && (var3.a6() == this || var3.s7() != 0)) {
         var3.n5(this, var2);
      } else {
         this.n5(new u2(this, var1, var2));
      }
   }

   public void l6(String var1) {
      y2 var2 = null;
      y2[] var3 = new y2[]{var2};
      boolean var4 = this.n5(var1, var3) && var3[0].a6() == this;
      var2 = var3[0];
      if (var4) {
         if (!var2.k5()) {
            throw new j3(com.aspose.slides.ms.System.d1.n5(new String[]{"Property ", var1, " isn't configurable"}));
         }

         this.l6.n5(var1);
         var2.c8();
         this.a6--;
      }
   }

   public final void n5(String var1, g7 var2, int var3) {
      u2 var4 = new u2(this, var1, var2);
      var4.k5((var3 & 1) == 0);
      var4.n5((var3 & 2) == 0);
      this.n5(var4);
   }

   public final void l6(String var1, g7 var2) {
      this.n5(new u2(this, var1, var2));
   }

   public void n5(y2 var1) {
      String var2 = var1.n5();
      y2 var3 = null;
      y2[] var4 = new y2[]{var3};
      boolean var5 = this.l6.n5(var2, var4) && var4[0].a6() == this;
      var3 = var4[0];
      if (var5) {
         switch (var3.s7()) {
            case 0:
               switch (var1.s7()) {
                  case 0:
                     this.l6.l6(var2).n5(this, var1.n5(this));
                     return;
                  case 1:
                     this.l6.n5(var2);
                     this.l6.n5(var2, var1);
                     return;
                  default:
                     return;
               }
            case 1:
               c2 var6 = (c2)var3;
               if (var1.s7() == 1) {
                  var6.n5(((c2)var1).x8() != null ? ((c2)var1).x8() : var6.x8());
                  var6.l6(((c2)var1).n3() != null ? ((c2)var1).n3() : var6.n3());
               } else {
                  var6.n5(this, var1.n5(this));
               }
         }
      } else {
         if (var3 != null) {
            var3.a6().u9(var3.n5());
         }

         this.l6.n5(var2, var1);
         this.a6++;
      }
   }

   private void u9(String var1) {
      y2 var2 = null;
      y2[] var3 = new y2[]{var2};
      boolean var4 = this.l6.n5(var1, var3) && var3[0].a6() == this;
      var2 = var3[0];
      if (var4) {
         this.l6.n5(var1, var2.t2());
         var2.c8();
      }
   }

   @Override
   public final IGenericEnumerator<KeyValuePair<String, g7>> iterator() {
      return new y1$n5(this);
   }

   public IGenericEnumerable<String> a6() {
      return new y1$l6(this);
   }

   public IGenericEnumerable<g7> u9() {
      return new y1$k5(this);
   }

   public g7 u6(y1 var1, g7[] var2) {
      if (var2.length <= 0) {
         throw new ArgumentException("propertyName");
      } else if (!var1.k5(var2[0].toString())) {
         return this.u6(var1.s7(), var2);
      } else {
         c2 var3 = com.aspose.slides.internal.v6g.k5.n5(var1.l6.l6(var2[0].toString()), c2.class);
         if (var3 == null) {
            return l5.n5;
         } else {
            return var3.x8() != null ? var3.x8() : l5.n5;
         }
      }
   }

   public g7 t1(y1 var1, g7[] var2) {
      if (var2.length <= 0) {
         throw new ArgumentException("propertyName");
      } else if (!var1.k5(var2[0].toString())) {
         return this.t1(var1.s7(), var2);
      } else {
         c2 var3 = com.aspose.slides.internal.v6g.k5.n5(var1.l6.l6(var2[0].toString()), c2.class);
         if (var3 == null) {
            return l5.n5;
         } else {
            return var3.n3() != null ? var3.n3() : l5.n5;
         }
      }
   }

   public final boolean n5(y1 var1) {
      if (var1 == null) {
         return false;
      } else if (var1 != l5.n5 && var1 != y5.n5) {
         return var1.s7() == this ? true : this.n5(var1.s7());
      } else {
         return false;
      }
   }

   @Override
   public Object C_() {
      return null;
   }

   public void n5(Object var1) {
   }

   public y1() {
      this.l6(true);
      this.k5(y5.n5);
   }

   public y1(y1 var1) {
      this.k5(var1);
      this.l6(true);
      var1.u3 = true;
   }

   // $VF: synthetic method
   static y1 l6(y1 var0) {
      return var0.s7();
   }
}
