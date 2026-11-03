package com.aspose.slides.internal.l6;

import com.aspose.slides.internal.n5.y2;

public class a6 extends l6 {
   @Override
   public Object u9(Object var1) {
      return var1 == null ? null : ((n3)var1).y4();
   }

   @Override
   public Object n5(y2 var1) {
      return new u3(var1);
   }

   @Override
   public y2 l6(int var1, String var2) {
      return new com.aspose.slides.internal.n5.t2(var1, var2);
   }

   @Override
   public void n5(Object var1, y2 var2, y2 var3) {
      if (var1 != null) {
         int var4 = 0;
         int var5 = 0;
         if (var2 != null) {
            var4 = var2.u9();
         }

         if (var3 != null) {
            var5 = var3.u9();
         }

         ((n3)var1).a6(var4);
         ((n3)var1).u9(var5);
      }
   }

   @Override
   public String u3(Object var1) {
      return var1 == null ? null : ((n3)var1).x8();
   }

   @Override
   public int k5(Object var1) {
      return var1 == null ? 0 : ((n3)var1).s7();
   }

   @Override
   public y2 h0(Object var1) {
      return var1 instanceof u3 ? ((u3)var1).n3() : null;
   }

   @Override
   public Object n5(Object var1, int var2) {
      return var1 == null ? null : ((n3)var1).n5(var2);
   }

   @Override
   public int a6(Object var1) {
      return var1 == null ? 0 : ((n3)var1).n5();
   }

   @Override
   public void u3(Object var1, Object var2) {
      if (var1 != null) {
         ((n3)var1).l6((n3)var2);
      }
   }

   @Override
   public int c8(Object var1) {
      return var1 == null ? 0 : ((n3)var1).a6();
   }

   @Override
   public void l6(Object var1, int var2) {
      if (var1 != null) {
         ((n3)var1).u3(var2);
      }
   }
}
