package com.aspose.slides.internal.o6t;

import com.aspose.slides.internal.f4l.p8;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.x4g.m1;
import java.awt.geom.AffineTransform;
import java.util.HashMap;
import java.util.Map;

public class l6 extends k5 {
   private l6$n5 v4;
   private Map<Integer, p8> u6 = new HashMap<>();
   private Map<Integer, com.aspose.slides.internal.x4g.t2> t1 = new HashMap<>();

   public l6(com.aspose.slides.internal.o9b.z1 var1, m1 var2) {
      super(var1, var2);
   }

   public void n5() {
      if (this.v4 != l6$n5.n5) {
         this.z8();
         this.v4 = l6$n5.n5;
      }
   }

   public void l6() {
      if (this.v4 != l6$n5.l6) {
         this.j5();
         this.v4 = l6$n5.l6;
      }
   }

   private void z8() {
      this.e5 = new AffineTransform(this.i1);
      this.b3 = new AffineTransform();
      this.e2();
   }

   private void j5() {
      this.e5 = new AffineTransform();
      this.b3 = new AffineTransform(this.i1);
      this.z7.k5(com.aspose.slides.internal.x4g.m1.n5.u9());
   }

   public void n5(int var1, p8 var2) {
      this.u6.put(var1, var2);
   }

   public p8 n5(int var1) {
      return this.u6.get(var1);
   }

   public void k5() {
      this.o0.setTransform(new AffineTransform());
      this.n5(com.aspose.slides.internal.x4g.m1.n5.u9());
   }

   public void n5(m1 var1) {
      var1.n5(com.aspose.slides.internal.x4g.m1.n5(this.b3), 1);
      this.z7.l6(var1);
   }

   public void l6(int var1) {
      com.aspose.slides.internal.x4g.t2 var2 = this.z7.n5();
      this.t1.put(var1, var2);
      this.k5();
   }

   public void n5(int var1, y1 var2, y1 var3, int var4) {
      com.aspose.slides.internal.x4g.t2 var5 = this.z7.n5(var2, var3, var4);
      this.t1.put(var1, var5);
      this.k5();
   }

   public void k5(int var1) {
      com.aspose.slides.internal.x4g.t2 var2 = this.t1.get(var1);
      if (var2 != null) {
         this.z7.n5(var2);
         this.t1.remove(var1);
      }
   }

   public void u3(int var1) {
      com.aspose.slides.internal.x4g.x8 var2 = this.z7.l6();
      this.t1.put(var1, new com.aspose.slides.internal.x4g.t2(var2));
   }

   public void a6(int var1) {
      com.aspose.slides.internal.x4g.t2 var2 = this.t1.get(var1);
      if (var2 != null) {
         this.z7.n5(var2.n5());
         this.t1.remove(var1);
      }
   }
}
