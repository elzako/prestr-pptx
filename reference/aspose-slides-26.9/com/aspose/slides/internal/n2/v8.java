package com.aspose.slides.internal.n2;

public class v8 extends com.aspose.slides.internal.s2.n5 {
   @Override
   public boolean l6(com.aspose.slides.internal.b9.s9 var1, com.aspose.slides.internal.z0k.l6 var2) {
      long var3 = var2.n5().getPosition();
      n5(var1, var2);
      com.aspose.slides.internal.b9.s4 var5 = (com.aspose.slides.internal.b9.s4)var1;
      new com.aspose.slides.internal.o3.t4().n5(var2, var5.n5());

      for (com.aspose.slides.internal.k1.q0 var9 : var5.l6()) {
         new com.aspose.slides.internal.o3.t9().n5(var2, var9);
      }

      var2.l6(var5.k5());
      var2.l6(var5.u3());
      var2.l6(var5.u9());
      var2.l6(var5.h0());
      new com.aspose.slides.internal.l0.q0().n5(var2, var5.c8());
      new com.aspose.slides.internal.o3.a6().n5(var2, var5.t2());
      var2.n5(var5.s7() & 4294967295L);
      var2.n5(var5.x8() & 4294967295L);
      var2.n5(var5.n3() & 4294967295L);
      var2.n5(var5.y4() & 4294967295L);
      var2.n5(var5.e2() & 4294967295L);
      var2.l6(var5.t9());
      var2.l6(var5.z1());
      var2.n5(var5.t4() & 4294967295L);
      var2.n5(var5.q0() & 4294967295L);
      var2.n5(var5.z3() & 4294967295L);
      var2.n5(var5.m1() & 4294967295L);
      var2.n5(var5.k7() & 4294967295L);
      com.aspose.slides.internal.o3.u9 var10 = new com.aspose.slides.internal.o3.u9(
         var3, var5.y2(), var5.x8(), var5.n3(), var5.y4(), var5.e2(), (int)(var5.s7() & 65535L)
      );
      var10.n5(var2, (com.aspose.slides.internal.y6.u3)var5.m3());
      com.aspose.slides.internal.o3.u9 var11 = new com.aspose.slides.internal.o3.u9(
         var3, var5.y2(), var5.q0(), var5.z3(), var5.m1(), var5.k7(), (int)(var5.t4() & 65535L)
      );
      var11.n5(var2, (com.aspose.slides.internal.y6.u3)var5.z8());
      return true;
   }
}
