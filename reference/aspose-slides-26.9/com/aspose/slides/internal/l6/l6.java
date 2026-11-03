package com.aspose.slides.internal.l6;

import com.aspose.slides.internal.n5.a0;
import com.aspose.slides.internal.n5.w1;
import com.aspose.slides.internal.n5.y2;

public abstract class l6 implements y4 {
   protected int n5 = 1;

   @Override
   public Object n5() {
      return this.n5(null);
   }

   @Override
   public Object n5(a0 var1, y2 var2, y2 var3, w1 var4) {
      return new k5(var1, var2, var3, var4);
   }

   @Override
   public Object n5(Object var1) {
      return this.n5(var1, null);
   }

   public Object n5(Object var1, Object var2) {
      if (var1 == null) {
         return null;
      }

      Object var3 = this.u9(var1);
      this.l6(var3, this.c8(var1));
      this.u3(var3, var2);
      int var4 = this.a6(var1);

      for (int var5 = 0; var5 < var4; var5++) {
         Object var6 = this.n5(var1, var5);
         Object var7 = this.n5(var6, var1);
         this.l6(var3, var7);
      }

      return var3;
   }

   @Override
   public void l6(Object var1, Object var2) {
      if (var1 != null && var2 != null) {
         ((n3)var1).n5((n3)var2);
      }
   }

   @Override
   public Object k5(Object var1, Object var2) {
      n3 var3 = (n3)var1;
      n3 var4 = (n3)var2;
      if (var2 == null) {
         return var1;
      }

      if (var3.k5()) {
         int var5 = var3.n5();
         if (var5 == 1) {
            var3 = var3.n5(0);
         } else if (var5 > 1) {
            throw new RuntimeException("more than one node as root (TODO: make exception hierarchy)");
         }
      }

      var3.n5(var4);
      return var3;
   }

   @Override
   public Object l6(Object var1) {
      n3 var2 = (n3)var1;
      if (var2 != null && var2.k5()) {
         if (var2.n5() == 0) {
            var2 = null;
         } else if (var2.n5() == 1) {
            var2 = var2.n5(0);
            var2.l6(null);
            var2.u3(-1);
         }
      }

      return var2;
   }

   @Override
   public Object n5(int var1, String var2) {
      y2 var3 = this.l6(var1, var2);
      return (n3)this.n5(var3);
   }

   @Override
   public int k5(Object var1) {
      return ((n3)var1).s7();
   }

   @Override
   public String u3(Object var1) {
      return ((n3)var1).x8();
   }

   public Object n5(Object var1, int var2) {
      return ((n3)var1).n5(var2);
   }

   public int a6(Object var1) {
      return ((n3)var1).n5();
   }

   public abstract y2 l6(int var1, String var2);
}
