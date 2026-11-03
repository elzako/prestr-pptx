package com.aspose.slides.internal.w2f;

import com.aspose.slides.internal.z0k.w1;
import java.util.Stack;

public class n5 extends l6 implements l6$k5 {
   private com.aspose.slides.internal.u0a.l6 n5;
   private com.aspose.slides.internal.u0a.l6 l6;
   private Stack k5 = new Stack();

   public void n5(String var1) {
      this.n5 = null;
      this.k5.clear();
      this.n5(new w1(var1), this);
   }

   public com.aspose.slides.internal.u0a.l6 n5() {
      return this.n5;
   }

   @Override
   public void n5(l6 var1) {
   }

   @Override
   public void n5(String var1, String var2) {
   }

   @Override
   public void l6(String var1) {
   }

   @Override
   public void n5(String var1, l6$l6 var2) {
      com.aspose.slides.internal.u0a.l6 var3 = new com.aspose.slides.internal.u0a.l6(var1);
      if (this.n5 == null) {
         this.n5 = var3;
         this.l6 = var3;
      } else {
         com.aspose.slides.internal.u0a.l6 var4 = (com.aspose.slides.internal.u0a.l6)this.k5.peek();
         var4.n5(var3);
      }

      this.k5.push(var3);
      this.l6 = var3;
      int var6 = var2.n5();

      for (int var5 = 0; var5 < var6; var5++) {
         this.l6.n5(var2.n5(var5), com.aspose.slides.internal.u0a.l6.l6(var2.l6(var5)));
      }
   }

   @Override
   public void k5(String var1) {
      this.l6 = (com.aspose.slides.internal.u0a.l6)this.k5.pop();
   }

   @Override
   public void u3(String var1) {
      this.l6.n5(com.aspose.slides.internal.u0a.l6.l6(var1));
   }

   @Override
   public void l6(l6 var1) {
   }
}
