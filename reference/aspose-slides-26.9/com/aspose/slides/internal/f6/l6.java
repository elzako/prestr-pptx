package com.aspose.slides.internal.f6;

import com.aspose.slides.internal.c0.c8;
import com.aspose.slides.internal.c0.s7;
import com.aspose.slides.internal.e1.t9;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.z4.j5;
import com.aspose.slides.internal.z4.s3;
import com.aspose.slides.internal.z4.t4;
import com.aspose.slides.internal.z4.y4;
import com.aspose.slides.internal.z4.z1;
import com.aspose.slides.ms.System.d1;

public abstract class l6 extends z1 {
   private final String k5;
   private final w1 u3 = w1.n5.u3();
   private boolean a6 = true;
   private y1 u9 = y1.n5.y4();
   protected final j5 n5;
   private int h0;

   protected l6(j5 var1, t9 var2) {
      super(var1.h0());
      this.k5 = d1.n5("{0}_{1}",new Object[]{ var2.h0(), this.c8()});
      var2.u9().n5(this.u3);
      this.a6 = var2.c8();
      var2.u3().a6(this.u9);
      this.n5 = var1;
   }

   @Override
   public void n5(t4 var1) {
      var1.n5(this.e2());
      var1.n5(this);
      var1.c8();
      var1.k5("/Type", "/Annot");
      var1.k5("/Subtype", "/Widget");
      var1.k5("/P", this.n5.t2());
      var1.k5("/FT", y4.u3(this.n5()));
      var1.n5("/F", 4);
      y1 var2 = new y1(this.u9.x8(), this.n5.u9() - this.u9.n3(), this.u9.s7(), this.u9.k5());
      var1.n5("/Rect", var2.y4());
      this.h0 = this.h0 | this.l6();
      if (this.u9()) {
         var1.n5("/Ff", this.h0);
      }

      var1.u3("/T", this.k5);
      this.l6(var1);
      var1.t2();
      var1.l6();
      this.k5(var1);
   }

   protected abstract int n5();

   protected int l6() {
      return this.a6 ? 0 : 1;
   }

   protected abstract void l6(t4 var1);

   protected abstract void k5(t4 var1);

   protected final String n5(com.aspose.slides.internal.p1s.l6 var1, com.aspose.slides.internal.p1s.n5 var2) {
      com.aspose.slides.internal.c0.l6 var3 = this.l6.t2().n5(var1);
      return d1.n5("{0} rg /{1} {2} Tf ",new Object[]{ s3.n5(var2), var3.x8(), s3.l6(var1.c8())});
   }

   protected static void n5(s3 var0, y1 var1) {
      var0.n5("0 g ");
      var0.n5(var1.a6());
      var0.u9();
      var0.n5(var1.t2());
      var0.u9();
      var0.n5(var1.h0());
      var0.u9();
      var0.n5(var1.l6());
      var0.n5(" re f ");
      var0.n5("1 g ");
      var0.n5(var1.a6() + 1.0F);
      var0.u9();
      var0.n5(var1.t2() + 1.0F);
      var0.u9();
      var0.n5(var1.h0() - 2.0F);
      var0.u9();
      var0.n5(var1.l6() - 2.0F);
      var0.n5(" re f ");
   }

   protected static void n5(s3 var0) {
      var0.n5(" /Tx BMC\r\n  q\r\n   BT\r\n    ");
   }

   protected static void l6(s3 var0) {
      var0.n5("\r\n   ET\r\n  Q\r\n EMC");
   }

   protected static void n5(s3 var0, com.aspose.slides.internal.p1s.n5 var1) {
      var0.n5(s3.n5(var1));
      var0.n5(" rg ");
   }

   protected final com.aspose.slides.internal.c0.l6 n5(s3 var1, com.aspose.slides.internal.p1s.l6 var2) {
      var1.n5("/");
      com.aspose.slides.internal.c0.l6 var3 = this.l6.t2().n5(var2);
      var1.n5(var3.x8());
      var1.u9();
      var1.n5(var2.c8());
      var1.n5(" Tf ");
      return var3;
   }

   protected static void n5(s3 var0, float var1) {
      var0.n5("1 0 0 1 2 ");
      var0.n5(var1);
      var0.n5(" Tm ");
   }

   protected static void n5(s3 var0, float var1, float var2) {
      var0.u9();
      var0.n5(var1);
      var0.u9();
      var0.n5(var2);
      var0.n5(" Td ");
   }

   protected static void n5(s3 var0, String var1, com.aspose.slides.internal.c0.l6 var2) {
      s7 var3 = com.aspose.slides.internal.v6g.k5.n5(var2, s7.class);
      if (var3 != null) {
         n5(var0, var1, var3);
      } else {
         n5(var0, var1, (c8)var2);
      }
   }

   protected static void n5(s3 var0, String var1, s7 var2) {
      var0.n5("[");
      var0.n5("(");
      var2.n5(var1, var0, true);
      var0.l6(")");
      var0.l6("]");
      var0.l6("TJ");
   }

   protected static void n5(s3 var0, String var1, c8 var2) {
      var0.n5("(");
      var2.n5(var1);
      var0.n5(var1);
      var0.n5(") Tj ");
   }

   private boolean u9() {
      return this.h0 != 0;
   }

   public final String k5() {
      return this.k5;
   }

   public final y1 u3() {
      return this.u9;
   }

   public final void n5(y1 var1) {
      var1.a6(this.u9);
   }

   public final j5 a6() {
      return this.n5;
   }
}
