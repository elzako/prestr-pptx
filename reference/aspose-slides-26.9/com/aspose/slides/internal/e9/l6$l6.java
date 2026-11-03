package com.aspose.slides.internal.e9;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.e1.a0;
import com.aspose.slides.internal.e1.c4;
import com.aspose.slides.internal.e1.c8;
import com.aspose.slides.internal.e1.j5;
import com.aspose.slides.internal.e1.k7;
import com.aspose.slides.internal.e1.m3;
import com.aspose.slides.internal.e1.n3;
import com.aspose.slides.internal.e1.r4;
import com.aspose.slides.internal.e1.s3;
import com.aspose.slides.internal.e1.s7;
import com.aspose.slides.internal.e1.t2;
import com.aspose.slides.internal.e1.w1;
import com.aspose.slides.internal.e1.x8;
import com.aspose.slides.internal.e1.y2;
import com.aspose.slides.internal.e1.y4;
import com.aspose.slides.internal.e1.z1;
import com.aspose.slides.internal.e1.z3;

public class l6$l6 extends y4 {
   private Dictionary<m3, Boolean> n5;
   private w1 l6;
   private Stack<n3> k5 = new Stack<>();

   public final w1 n5() {
      return this.l6;
   }

   public l6$l6(Dictionary<m3, Boolean> var1) {
      this.n5 = var1;
   }

   private void n5(m3 var1) {
      if (!this.n5.containsKey(var1)) {
         this.k5.peek().n5(var1);
      }
   }

   @Override
   public void n5(w1 var1) {
      this.l6 = new w1(var1.l6(), var1.k5());
      this.k5.push(this.l6);
   }

   @Override
   public void n5(t2 var1) {
      t2 var2 = new t2();
      if (!this.n5.containsKey(var1)) {
         var2.n5(var1.u3());
         var2.n5(var1.a6());
         this.k5.peek().n5(var2);
      }

      this.k5.push(var2);
   }

   @Override
   public void l6(t2 var1) {
      this.k5.pop();
   }

   @Override
   public void n5(z1 var1) {
      this.n5((m3)var1);
   }

   @Override
   public void l6(r4 var1) {
      r4 var2 = new r4();
      if (!this.n5.containsKey(var1)) {
         var2.n5(var2.u3());
         var2.n5(var2.a6());
         var2.n5(var1.k5());
         var2.k5(var1.h0());
         this.k5.peek().n5(var2);
      }

      this.k5.push(var2);
   }

   @Override
   public void n5(r4 var1) {
      this.k5.pop();
   }

   @Override
   public void n5(c4 var1) {
      c4 var2 = new c4();
      if (!this.n5.containsKey(var1)) {
         var2.n5(var1.n5());
         this.k5.peek().n5(var2);
      }

      this.k5.push(var2);
   }

   @Override
   public void l6(c4 var1) {
      this.k5.pop();
   }

   @Override
   public void n5(y2 var1) {
      this.n5((m3)var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.a6 var1) {
      this.n5((m3)var1);
   }

   @Override
   public void n5(k7 var1) {
      this.n5((m3)var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.u9 var1) {
      this.n5((m3)var1);
   }

   @Override
   public void n5(j5 var1) {
      this.n5((m3)var1);
   }

   @Override
   public void n5(s3 var1) {
      this.n5((m3)var1);
   }

   @Override
   public void n5(s7 var1) {
      this.n5((m3)var1);
   }

   @Override
   public void n5(x8 var1) {
      this.n5((m3)var1);
   }

   @Override
   public void n5(a0 var1) {
      this.n5((m3)var1);
   }

   @Override
   public void n5(c8 var1) {
      this.n5((m3)var1);
   }

   @Override
   public boolean n5(z3 var1) {
      this.n5((m3)var1);
      return true;
   }
}
