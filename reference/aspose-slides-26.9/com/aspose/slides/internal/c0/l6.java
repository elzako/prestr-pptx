package com.aspose.slides.internal.c0;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.e1x.i1;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.internal.z4.z1;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public abstract class l6 extends z1 {
   private int u3;
   protected i1 n5;
   private int a6;
   private String u9;
   protected boolean k5;

   protected l6(com.aspose.slides.internal.z4.c8 var1, int var2, i1 var3, int var4) {
      super(var1);
      this.u3 = var2;
      this.n5 = var3;
      this.a6 = var4;
   }

   public void n5(t4 var1) {
   }

   public abstract byte[] n5();

   public static l6 n5(com.aspose.slides.internal.z4.c8 var0, int var1, i1 var2, int var3, int var4) {
      switch (var3) {
         case 0:
         case 1:
         case 2:
            return new s7(var0, var1, var2, var3, var4);
         case 3:
            return new c8(var0, var1, var2, var3, var4);
         default:
            throw new InvalidOperationException("Unexpected font type.");
      }
   }

   protected final int n5(int var1) {
      return com.aspose.slides.internal.v6g.k5.u3(q1.u3(var1 * 1000.0F / this.n5.t2()), 14);
   }

   public final boolean l6() {
      return (this.u3 & 2) != 0 && (this.n5.c8() & 2) == 0;
   }

   public final boolean k5() {
      return (this.u3 & 1) != 0 && (this.n5.c8() & 1) == 0;
   }

   public final String u3() {
      if (this.u9 == null) {
         this.u9 = this.m3();
      }

      return this.u9;
   }

   public final int a6() {
      return -this.n5(this.n5.x8());
   }

   public final int u9() {
      return this.n5(this.n5.s7());
   }

   public final int t9() {
      return this.n5(this.n5.z8());
   }

   public final int z1() {
      int var1 = 0;
      var1 |= 32;
      var1 |= (this.n5.c8() & 2) != 0 ? 64 : 0;
      return var1 | ((this.n5.c8() & 1) != 0 ? 262144 : 0);
   }

   public final y1 t4() {
      return new y1(this.n5(this.n5.q0()), this.n5(this.n5.z3()), this.n5(this.n5.m1() - this.n5.q0()), this.n5(this.n5.k7() - this.n5.z3()));
   }

   public final float q0() {
      return this.n5.w1();
   }

   @Override
   public int n3() {
      return 1;
   }

   public final int z3() {
      return this.a6;
   }

   public final boolean m1() {
      return this.k5;
   }

   public final void n5(boolean var1) {
      this.k5 = var1;
   }

   protected final String k7() {
      String var1 = this.n5.a6();
      if (var1 == null) {
         var1 = d1.n5(this.n5.u3(), " ", "#20");
      }

      return var1;
   }

   @Override
   protected String y4() {
      a5 var1 = new a5();
      var1.n5("F");
      String var2 = d1.n5("{0:D5}", new Object[]{super.c8()});
      byte var3 = 17;

      for (int var4 = 0; var4 < var2.length(); var4++) {
         var1.n5((char)(var2.charAt(var4) + 17));
      }

      return var1.toString();
   }

   protected String m3() {
      a5 var1 = new a5();
      if (!this.m1()) {
         var1.n5(this.x8());
         var1.n5("+");
      }

      var1.n5(this.k7());
      if (this.k5() && this.l6()) {
         var1.n5(",BoldItalic");
      } else if (this.k5()) {
         var1.n5(",Bold");
      } else if (this.l6()) {
         var1.n5(",Italic");
      }

      return var1.n5(" ", d1.n5).toString();
   }
}
