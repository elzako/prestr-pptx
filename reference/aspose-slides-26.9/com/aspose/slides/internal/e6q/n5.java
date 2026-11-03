package com.aspose.slides.internal.e6q;

import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.w9c.n3;
import com.aspose.slides.internal.w9c.x8;
import java.awt.geom.IllegalPathStateException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class n5 implements u3 {
   private final float u9;
   protected final com.aspose.slides.internal.x1j.h0 n5;
   protected final int l6;
   protected final int k5;
   protected final int u3;
   protected final List<t2> a6 = new ArrayList<>();

   protected n5(float var1, com.aspose.slides.internal.x1j.h0 var2, int var3, int var4, int var5) {
      this.u9 = var1;
      this.n5 = var2;
      this.l6 = var3;
      this.k5 = var4;
      this.u3 = var5;
   }

   @Override
   public void n5(float var1, float var2) {
      this.l6().n5(com.aspose.slides.internal.e6q.u9.n5(var1, var2));
   }

   @Override
   public void l6(float var1, float var2) {
      this.l6().k5(com.aspose.slides.internal.e6q.u9.l6(var1, var2));
   }

   @Override
   public void k5(float var1, float var2) {
      this.u3().l6(com.aspose.slides.internal.e6q.u9.n5(var1, var2));
   }

   @Override
   public void u3(float var1, float var2) {
      this.u3().l6(com.aspose.slides.internal.e6q.u9.l6(var1, var2));
   }

   @Override
   public void n5(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.u3().l6(com.aspose.slides.internal.e6q.u9.n5(var3, var4, var5, var6));
   }

   @Override
   public void n5(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.u3().l6(com.aspose.slides.internal.e6q.u9.n5(var3, var4, var5, var6, var7, var8));
   }

   @Override
   public void a6(float var1, float var2) {
      this.u3().u3(com.aspose.slides.internal.e6q.u9.l6(var1, var2));
   }

   @Override
   public void l6(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.u3().u3(com.aspose.slides.internal.e6q.u9.n5(var3, var4, var1, var2));
   }

   @Override
   public void l6(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.u3().u3(com.aspose.slides.internal.e6q.u9.n5(var5, var6, var3, var4, var1, var2));
   }

   @Override
   public void n5() {
      this.a6();
   }

   @Override
   public void n5(w1 var1, w1 var2, w1 var3, w1 var4, w1 var5, w1 var6) {
      if (!this.a6.isEmpty()) {
         x8 var7 = n3.n5(this.u9, true, this.l6, this.u3, this, var1, var2, var3, var4, var5, var6);
         x8 var8 = n3.n5(this.u9, false, this.k5, this.u3, this, var1, var2, var3, var4, var5, var6);
         var7.l6();
         var8.l6();
         var7.k5();
         var8.k5();
         this.u9();
         var7.n5();
         this.u9();
         var8.n5();
         this.u9();
      }
   }

   @Override
   public t2 l6() {
      return this.a6.get(0);
   }

   @Override
   public t2 k5() {
      return this.a6.get(this.a6.size() - 1);
   }

   protected t2 u3() {
      if (this.a6.isEmpty()) {
         this.a6();
      }

      return this.a6.get(this.a6.size() - 1);
   }

   protected void a6() {
      this.a6.add(new t2());
   }

   protected void u9() {
      for (t2 var2 : this.a6) {
         boolean var3 = var2.l6().u3() > 0 || var2.k5().u3() > 0;
         this.n5(var2);
         this.l6(var2);
         if (var3) {
            this.n5.n5();
         }
      }

      this.a6.clear();
   }

   protected void n5(t2 var1) {
      Iterator var2 = var1.l6().l6();

      while (var2.hasNext()) {
         u9 var3 = (u9)var2.next();
         var3.n5(this.n5);
         var2.remove();
      }
   }

   protected void l6(t2 var1) {
      for (Iterator var2 = var1.k5().k5(); var2.hasNext(); var2.remove()) {
         u9 var3 = (u9)var2.next();

         try {
            var3.n5(this.n5);
         } catch (IllegalPathStateException var6) {
            int var5 = var3.n5();
            var3.n5(2);
            var3.n5(this.n5);
            var3.n5(var5);
            var3.n5(this.n5);
         }
      }
   }
}
