package com.aspose.slides.internal.h2;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public class t2 {
   private int c8 = -1;
   public int n5;
   public com.aspose.slides.internal.o9b.c8 l6 = new com.aspose.slides.internal.o9b.c8();
   public String k5;
   public int u3;
   public com.aspose.slides.internal.f2.k5 a6;
   public com.aspose.slides.internal.f2.k5 u9;
   private com.aspose.slides.internal.r4.t2 t2;
   public boolean h0;
   private static final String[] s7 = new String[]{"LINEAR-GRADIENT"};
   private t2$k5 x8;
   private static final t2$n5 n3 = t2$n5.n5(95, new t2$l6(null), com.aspose.slides.internal.o9b.c8.u3.o8());
   private t2$n5[] y4 = new t2$n5[4];
   private q0[] e2 = new q0[4];
   private static final com.aspose.slides.internal.v6g.u9 t9 = new com.aspose.slides.internal.v6g.u9("TL", "TR", "BL", "BR", "LINEAR-GRADIENT");

   public final boolean n5() {
      return this.x8 != null;
   }

   public final t2$k5 l6() {
      return this.x8;
   }

   private static t2$k5 n5(String var0) {
      if (var0 != null) {
         com.aspose.slides.internal.r7c.c8 var1 = new com.aspose.slides.internal.r7c.c8("^([\\w-]+)\\((.+)\\)$", 66);
         if (var1.u3(var0)) {
            com.aspose.slides.internal.r7c.u3 var2 = var1.l6(var0);
            if (var2.a6().n5() == 3) {
               String var3 = var2.a6().n5(1).k5();
               String var4 = var2.a6().n5(2).k5();
               switch (t9.n5(d1.s7(var3))) {
                  case 4:
                     return new t2$u3(var4);
               }
            }
         }
      }

      return null;
   }

   public static t2$n5 k5() {
      return n3;
   }

   private t2(com.aspose.slides.internal.e5.w1 var1) {
      this.n5 = var1.u3(8).a6();
      com.aspose.slides.internal.o9b.c8 var2 = var1.u3(9).n5(var1.n5().q_()).o8();
      if ((var2.s7() & 255) == 0) {
         com.aspose.slides.internal.o9b.c8.u3.n5(this.l6);
      } else {
         var2.n5(this.l6);
      }

      this.h0 = var1.u3(297).a6() == 149;
      String var3 = var1.u3(10).j_();
      if (var3 != null && !d1.a6(var3, "none")) {
         this.k5 = var3;
         this.u3 = var1.u3(14).a6();
         this.a6 = var1.u3(12).c8();
         this.u9 = var1.u3(13).c8();
      } else {
         this.k5 = d1.n5;
         this.u3 = -1;
         this.a6 = null;
         this.u9 = null;
      }

      this.n5(var1, 0, 23, 25, 26, 172);
      this.n5(var1, 1, 19, 21, 22, 171);
      this.n5(var1, 2, 47, 49, 50, 177);
      this.n5(var1, 3, 33, 35, 36, 174);
      l6 var4 = new l6();
      var4.n5(var1);
      if (var4.n5()) {
         if (this.y4[0] == null) {
            this.y4[0] = n3;
         }

         if (this.y4[1] == null) {
            this.y4[1] = n3;
         }

         if (this.y4[2] == null) {
            this.y4[2] = n3;
         }

         if (this.y4[3] == null) {
            this.y4[3] = n3;
         }

         this.y4[0].n5 = var4;
         this.y4[1].n5 = var4;
         this.y4[2].n5 = var4;
         this.y4[3].n5 = var4;
      }
   }

   public static t2 n5(com.aspose.slides.internal.e5.w1 var0) {
      t2 var1 = new t2(var0);
      t2 var2 = null;
      if ((var1.e2[0] == null || var1.e2[0].c8().k5())
         && (var1.e2[1] == null || var1.e2[1].c8().k5())
         && (var1.e2[2] == null || var1.e2[2].c8().k5())
         && (var1.e2[3] == null || var1.e2[3].c8().k5())
         && (var1.a6 == null || var1.a6.k5())
         && (var1.u9 == null || var1.u9.k5())) {
         var2 = var1;
      }

      var1.x8 = n5(var1.k5);
      if ((var2 == null || var2 == var1) && var1.x8 == null && !d1.n5(var1.k5)) {
         String var3 = com.aspose.slides.internal.f2.s7.n5(var1.k5);
         com.aspose.slides.internal.y1.u3 var4 = var0.n5().q_();
         com.aspose.slides.internal.r4.s7 var5 = var4.a6().h0();
         com.aspose.slides.internal.r4.x8 var6 = var4.n3();
         var1.t2 = var5.n5(var3, var6);
      }

      return var2 != null ? var2 : var1;
   }

   private void n5(com.aspose.slides.internal.e5.w1 var1, int var2, int var3, int var4, int var5, int var6) {
      this.e2[var2] = var1.u3(var6).x8();
      int var7 = var1.u3(var4).a6();
      if (var7 != 95) {
         com.aspose.slides.internal.y1.u3 var8 = var1.n5().q_();
         this.n5(t2$n5.n5(var7, var1.u3(var5).x8(), var1.u3(var3).n5(var8).o8()), var2);
      }
   }

   private void n5(t2$n5 var1, int var2) {
      this.y4[var2] = var1;
   }

   public final t2$n5 n5(int var1) {
      return this.y4[var1] == null ? k5() : this.y4[var1];
   }

   public final com.aspose.slides.internal.r4.t2 u3() {
      return this.t2;
   }

   public final int n5(boolean var1) {
      return this.n5(2, var1);
   }

   public final int l6(boolean var1) {
      return this.n5(3, var1);
   }

   public final int k5(boolean var1) {
      return this.n5(0, var1);
   }

   public final int u3(boolean var1) {
      return this.n5(1, var1);
   }

   public final int n5(boolean var1, com.aspose.slides.internal.f2.u9 var2) {
      return this.n5(2, var1, var2);
   }

   public final int l6(boolean var1, com.aspose.slides.internal.f2.u9 var2) {
      return this.n5(3, var1, var2);
   }

   public final int k5(boolean var1, com.aspose.slides.internal.f2.u9 var2) {
      return this.n5(0, var1, var2);
   }

   public final int u3(boolean var1, com.aspose.slides.internal.f2.u9 var2) {
      return this.n5(1, var1, var2);
   }

   public final int n5(int var1, boolean var2) {
      return this.y4[var1] != null && this.y4[var1].l6 != 95 && this.y4[var1].l6 != 57 && (!var2 || !this.y4[var1].k5.s7()) ? this.y4[var1].k5.t2() : 0;
   }

   public final com.aspose.slides.internal.o9b.c8 l6(int var1) {
      return this.y4[var1] != null ? this.y4[var1].l6() : com.aspose.slides.internal.o9b.c8.u3;
   }

   public final int k5(int var1) {
      return this.y4[var1] != null ? this.y4[var1].l6 : 95;
   }

   public final l6 u3(int var1) {
      return this.y4[var1] != null ? this.y4[var1].n5 : null;
   }

   public final int n5(int var1, boolean var2, com.aspose.slides.internal.f2.u9 var3) {
      return this.e2[var1] != null && (!var2 || !this.e2[var1].s7()) ? this.e2[var1].n5(var3) : 0;
   }

   public final q0 a6(int var1) {
      return this.e2[var1];
   }

   public final int a6(boolean var1, com.aspose.slides.internal.f2.u9 var2) {
      return this.n5(var1, var2) + this.l6(var1, var2) + this.n5(var1) + this.l6(var1);
   }

   public final int u9(boolean var1, com.aspose.slides.internal.f2.u9 var2) {
      return this.k5(var1, var2) + this.u3(var1, var2) + this.k5(var1) + this.u3(var1);
   }

   @Override
   public String toString() {
      return d1.n5(new Object[]{
         "CommonBordersAndPadding (Before, After, Start, End):\n",
         "Borders: (",
         com.aspose.slides.ms.System.a3.l6(this.k5(false)),
         ", ",
         com.aspose.slides.ms.System.a3.l6(this.u3(false)),
         ", ",
         com.aspose.slides.ms.System.a3.l6(this.n5(false)),
         ", ",
         com.aspose.slides.ms.System.a3.l6(this.l6(false)),
         ")\n",
         "Border Colors: (",
         this.l6(0),
         ", ",
         this.l6(1),
         ", ",
         this.l6(2),
         ", ",
         this.l6(3),
         ")\n",
         "Padding: (",
         com.aspose.slides.ms.System.a3.l6(this.k5(false, null)),
         ", ",
         com.aspose.slides.ms.System.a3.l6(this.u3(false, null)),
         ", ",
         com.aspose.slides.ms.System.a3.l6(this.n5(false, null)),
         ", ",
         com.aspose.slides.ms.System.a3.l6(this.l6(false, null)),
         ")\n"
      });
   }

   public final boolean a6() {
      return !this.l6.t2() || this.u3() != null || this.n5();
   }

   public final boolean n5(com.aspose.slides.internal.f2.u9 var1) {
      return this.k5(false, var1) + this.u3(false, var1) + this.n5(false, var1) + this.l6(false, var1) > 0;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }

      t2 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, t2.class);
      return var2 == null
         ? false
         : this.n5 == var2.n5
            && com.aspose.slides.internal.v3.u3.n5(this.l6.o8(), var2.l6.o8())
            && com.aspose.slides.internal.v3.u3.n5(this.k5, var2.k5)
            && com.aspose.slides.internal.v3.u3.n5(this.a6, this.a6)
            && com.aspose.slides.internal.v3.u3.n5(this.u9, var2.u9)
            && this.u3 == var2.u3
            && j8.n5(this.y4, var2.y4)
            && j8.n5(this.e2, var2.e2);
   }

   @Override
   public int hashCode() {
      if (this.c8 == -1) {
         int var1 = n5(this.l6.o8(), this.k5, this.a6, this.u9, this.y4[0], this.y4[1], this.y4[2], this.y4[3], this.e2[0], this.e2[1], this.e2[2], this.e2[3]);
         var1 = 37 * var1 + this.n5;
         var1 = 37 * var1 + this.u3;
         this.c8 = var1;
      }

      return this.c8;
   }

   private static int n5(Object... var0) {
      int var1 = 17;

      for (Object var5 : var0) {
         var1 = 37 * var1 + (var5 == null ? 0 : var5.hashCode());
      }

      return var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return t9;
   }
}
