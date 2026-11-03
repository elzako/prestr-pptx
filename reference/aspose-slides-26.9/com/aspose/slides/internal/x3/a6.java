package com.aspose.slides.internal.x3;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.i0.e9;
import com.aspose.slides.internal.i0.f2;
import com.aspose.slides.internal.i0.i9;
import com.aspose.slides.internal.i0.o0;
import com.aspose.slides.internal.i0.p3;
import com.aspose.slides.internal.i0.p8;
import com.aspose.slides.internal.i0.s4;
import com.aspose.slides.internal.i0.z1;
import com.aspose.slides.internal.i0.z7;
import com.aspose.slides.internal.j9e.t2;
import com.aspose.slides.internal.l5.c8;
import com.aspose.slides.internal.n2d.t4;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.e5;
import com.aspose.slides.internal.o9b.i1;
import com.aspose.slides.internal.o9b.m3;
import com.aspose.slides.internal.o9b.n3;
import com.aspose.slides.internal.r6.u9;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.x4g.s7;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class a6 {
   private com.aspose.slides.internal.r6.n5 l6;
   private Dictionary<Integer, l6> k5 = new Dictionary<>();
   private com.aspose.slides.internal.o9b.u3 u3 = null;
   private z1 a6 = null;
   private m3 u9 = null;
   private e9 h0 = null;
   private s7 c8 = null;
   private p3 t2 = null;
   private a0 s7 = null;
   private i9 x8 = null;
   private n3 n3 = null;
   private p8 y4 = null;
   private e5 e2 = null;
   private s4 t9 = null;
   private t2 z1 = null;
   private z7 t4 = null;
   private c8 q0 = null;
   private o0 z3 = null;
   private Stack<n5> m1 = new Stack<>();
   private n5[] k7 = new n5[10];
   private m1 m3 = new m1();
   private float z8 = 1.0F;
   private int j5 = 1;
   private m1 w1 = new m1();
   private final u9 r4;
   public boolean n5;
   private com.aspose.slides.internal.o9b.l6 c4;
   private boolean y2;
   private float y1;
   private float a0;

   public a6(u9 var1, com.aspose.slides.internal.r6.n5 var2) {
      this.r4 = var1;
      this.l6 = var2;
      this.z8 = 1.0F;
      this.j5 = 1;
   }

   public final void n5(Object var1) {
      this.r4.n5(var1);
   }

   public final <TSurface> TSurface n5() {
      return this.r4.n5();
   }

   public final com.aspose.slides.internal.o1.u3 l6() {
      return this.l6.n5();
   }

   public final a0 k5() {
      return this.l6.l6();
   }

   public final void n5(a0 var1) {
      this.l6.n5(var1);
      this.n5 = true;
   }

   public final m1 u3() {
      return this.r4.l6();
   }

   public final m1 a6() {
      return this.w1;
   }

   public final void n5(m1 var1) {
      this.w1 = var1;
      this.n5 = true;
   }

   public final a0 u9() {
      return this.l6.u3();
   }

   public final com.aspose.slides.internal.o9b.u3 h0() {
      if (this.u3 == null) {
         throw new InvalidOperationException("Brush is not initialized");
      } else {
         return this.u3;
      }
   }

   public final m3 c8() {
      if (this.u9 == null) {
         throw new InvalidOperationException("Pen is not initialized");
      } else {
         return this.u9;
      }
   }

   public final n3 t2() {
      if (this.n3 == null) {
         throw new InvalidOperationException("Font is not initialized");
      } else {
         return this.n3;
      }
   }

   public final s7 s7() {
      if (this.c8 == null) {
         throw new InvalidOperationException("Path is not initialized");
      } else {
         return this.c8;
      }
   }

   public final a0 x8() {
      if (this.s7 == null) {
         throw new InvalidOperationException("Region is not initialized");
      } else {
         return this.s7;
      }
   }

   public final e5 n3() {
      if (this.e2 == null) {
         throw new InvalidOperationException("StringFormat is not initialized");
      } else {
         return this.e2;
      }
   }

   public final t2 y4() {
      if (this.z1 == null) {
         throw new InvalidOperationException("ImageAttributes is not initialized");
      } else {
         return this.z1;
      }
   }

   public final c8 e2() {
      if (this.q0 == null) {
         throw new InvalidOperationException("Image is not initialized");
      } else {
         return this.q0;
      }
   }

   public final z1 t9() {
      return this.a6;
   }

   public final void n5(int var1, boolean var2) {
      if (!var2 && this.k5.containsKey(var1)) {
         com.aspose.slides.internal.o9b.u3 var5 = com.aspose.slides.internal.v6g.k5.n5(this.k5.get_Item(var1).n5(), com.aspose.slides.internal.o9b.u3.class);
         if (var5 == null) {
            throw new ArgumentException(d1.n5(new String[]{"Unable to select Brush for brushId=", a3.l6(var1)}));
         }

         this.u3 = var5;
         this.a6 = (z1)this.k5.get_Item(var1).l6();
      } else {
         com.aspose.slides.internal.o9b.c8 var3 = com.aspose.slides.internal.o9b.c8.n5(var1).o8();
         this.u3 = new i1(var3.o8());
         this.a6 = new z1();
         com.aspose.slides.internal.i0.d1 var4 = new com.aspose.slides.internal.i0.d1();
         var4.n5(new com.aspose.slides.internal.i0.n5(var3.o8()));
         this.a6.n5(var4);
      }
   }

   public final void n5(int var1, Object var2, f2 var3) {
      if (this.k5.containsKey(var1)) {
         this.k5.set_Item(var1, new l6(var2, var3));
      } else {
         this.k5.addItem(var1, new l6(var2, var3));
      }
   }

   public final void n5(int var1) {
      if (this.k5.containsKey(var1)) {
         m3 var2 = com.aspose.slides.internal.v6g.k5.n5(this.k5.get_Item(var1).n5(), m3.class);
         if (var2 == null) {
            throw new ArgumentException(d1.n5(new String[]{"Unable to select Pen for penId=", a3.l6(var1)}));
         }

         List var3 = new List();
         this.u9 = var2;
         if (this.u9.x8() == 5) {
            for (int var4 = 1; var4 < this.u9.s7().length; var4 += 2) {
               if (this.u9.s7()[var4] > 0.1) {
                  var3.addItem(this.u9.s7()[var4 - 1]);
                  var3.addItem(this.u9.s7()[var4]);
               }
            }

            if (var3.size() == 0) {
               this.u9.l6((float[])null);
               this.u9.k5(0);
            } else {
               this.u9.l6(com.aspose.slides.internal.n2d.t4.k5(var3));
            }
         }

         this.h0 = (e9)this.k5.get_Item(var1).l6();
      }
   }

   public final void l6(int var1) {
      if (this.k5.containsKey(var1)) {
         s7 var2 = com.aspose.slides.internal.v6g.k5.n5(this.k5.get_Item(var1).n5(), s7.class);
         if (var2 == null) {
            throw new ArgumentException(d1.n5(new String[]{"Unable to select GraphicsPath for pathId=", a3.l6(var1)}));
         }

         this.c8 = var2;
         this.t2 = (p3)this.k5.get_Item(var1).l6();
      }
   }

   public final void k5(int var1) {
      if (this.k5.containsKey(var1)) {
         a0 var2 = com.aspose.slides.internal.v6g.k5.n5(this.k5.get_Item(var1).n5(), a0.class);
         if (var2 == null) {
            throw new ArgumentException(d1.n5(new String[]{"Unable to select Region for regionId=", a3.l6(var1)}));
         }

         this.s7 = var2;
         this.x8 = (i9)this.k5.get_Item(var1).l6();
      }
   }

   public final void u3(int var1) {
      if (this.k5.containsKey(var1)) {
         n3 var2 = com.aspose.slides.internal.v6g.k5.n5(this.k5.get_Item(var1).n5(), n3.class);
         if (var2 == null) {
            throw new ArgumentException(d1.n5(new String[]{"Unable to select Font for fontId=", a3.l6(var1)}));
         }

         this.n3 = var2;
         this.y4 = (p8)this.k5.get_Item(var1).l6();
      }
   }

   public final void a6(int var1) {
      if (this.k5.containsKey(var1)) {
         e5 var2 = com.aspose.slides.internal.v6g.k5.n5(this.k5.get_Item(var1).n5(), e5.class);
         if (var2 == null) {
            throw new ArgumentException(d1.n5(new String[]{"Unable to select StringFormat for formatId=", a3.l6(var1)}));
         }

         this.e2 = var2;
         this.t9 = (s4)this.k5.get_Item(var1).l6();
      }
   }

   public final void u9(int var1) {
      if (this.k5.containsKey(var1)) {
         t2 var2 = com.aspose.slides.internal.v6g.k5.n5(this.k5.get_Item(var1).n5(), t2.class);
         if (var2 == null) {
            throw new ArgumentException(d1.n5(new String[]{"Unable to select ImageAttributes for attributesId=", a3.l6(var1)}));
         }

         this.z1 = var2;
         this.t4 = (z7)this.k5.get_Item(var1).l6();
      }
   }

   public final void h0(int var1) {
      if (this.k5.containsKey(var1)) {
         c8 var2 = com.aspose.slides.internal.v6g.k5.n5(this.k5.get_Item(var1).n5(), c8.class);
         if (var2 == null) {
            throw new ArgumentException(d1.n5(new String[]{"Unable to select Image for imageId=", a3.l6(var1)}));
         }

         this.q0 = var2;
         this.z3 = (o0)this.k5.get_Item(var1).l6();
      }
   }

   public final void n5(int var1, n5 var2) {
      if (var1 >= this.k7.length) {
         n5[][] var3 = new n5[][]{this.k7};
         com.aspose.slides.ms.System.u3.n5(var3, var1 + 1);
         this.k7 = var3[0];
      }

      this.k7[var1] = var2;
   }

   public final void n5(int var1, com.aspose.slides.internal.o9b.z1 var2) {
      if (var1 < this.k7.length) {
         n5 var3 = this.k7[var1];
         if (var3 != null) {
            this.l6(var3.a6().u9());
            this.n5(var3.n5().u9());
            this.n5(var3.l6().l6());
            this.n5(var3.h0());
            this.c8(var3.u9());
            var2.n5(var3.k5());
         }

         this.k7[var1] = null;
      }
   }

   public final void l6(int var1, n5 var2) {
      if (this.m1.size() < var1) {
         while (this.m1.size() < var1) {
            this.m1.push(null);
         }
      }

      if (this.m1.size() > var1) {
         while (this.m1.size() > var1) {
            this.m1.pop();
         }
      }

      if (this.m1.size() == var1) {
         this.m1.push(var2);
      }
   }

   public final void l6(int var1, com.aspose.slides.internal.o9b.z1 var2) {
      n5 var3 = null;
      if (this.m1.size() > var1) {
         while (this.m1.size() > var1) {
            var3 = this.m1.pop();
         }
      }

      if (var3 != null) {
         if (var2 != null) {
            var2.n5(var3.u3());
         }

         this.n5(var3.l6().l6());
         this.n5(var3.n5().u9());
         this.l6(var3.a6().u9());
         this.n5(var3.h0());
         this.c8(var3.u9());
      }
   }

   public final m1 z1() {
      m1 var1 = new m1();
      var1.n5(this.a6(), 1);
      var1.n5(this.t4(), 1);
      this.k5(var1);
      return var1;
   }

   public final void n5(int var1, float var2) {
      m1 var3 = new m1();
      switch (var1) {
         case 0:
            var3.n5(var2, var2);
         case 1:
         default:
            break;
         case 2:
            var3.n5(var2, var2);
            break;
         case 3:
            var3.n5(var2 * 96.0F / 72.0F, var2 * 96.0F / 72.0F);
            break;
         case 4:
            var3.n5(var2 * 96.0F, var2 * 96.0F);
            break;
         case 5:
            var3.n5(var2 * 96.0F / 300.0F, var2 * 96.0F / 300.0F);
            break;
         case 6:
            var3.n5(var2 * 96.0F / 25.4F, var2 * 96.0F / 25.4F);
      }

      this.m3 = var3;
   }

   public final m1 t4() {
      return this.m3;
   }

   public final void l6(m1 var1) {
      this.m3 = var1;
      this.n5 = true;
   }

   public final float q0() {
      return this.z8;
   }

   public final void n5(float var1) {
      this.z8 = var1;
   }

   public final int z3() {
      return this.j5;
   }

   public final void c8(int var1) {
      this.j5 = var1;
   }

   public final com.aspose.slides.internal.o9b.l6 m1() {
      return this.c4;
   }

   public final void n5(com.aspose.slides.internal.o9b.l6 var1) {
      this.c4 = var1;
   }

   public final boolean k7() {
      return this.y2;
   }

   public final void n5(boolean var1) {
      this.y2 = var1;
   }

   public final float m3() {
      return this.y1;
   }

   public final void l6(float var1) {
      this.y1 = var1;
   }

   public final float z8() {
      return this.a0;
   }

   public final void k5(float var1) {
      this.a0 = var1;
   }

   private void k5(m1 var1) {
      if (!this.k7()) {
         if (this.z3() != 2) {
            if (!(this.m3() <= 0.0F) && !(this.z8() <= 0.0F)) {
               float var2 = this.z3() == 1 ? 100.0F : 96.0F;
               float var3 = this.m3() / var2;
               float var4 = this.z8() / var2;
               float var5 = 1.0E-6F;
               if (!(q1.n5(var3 - 1.0F) < 1.0E-6F) || !(q1.n5(var4 - 1.0F) < 1.0E-6F)) {
                  var1.n5(var3, var4, 1);
               }
            }
         }
      }
   }
}
