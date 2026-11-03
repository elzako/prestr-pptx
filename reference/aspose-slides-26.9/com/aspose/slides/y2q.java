package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.NotImplementedException;

final class y2q {
   private boolean n5;
   private int l6;
   private boolean k5;
   private com.aspose.slides.ms.System.o5<Boolean> u3 = new com.aspose.slides.ms.System.o5<>();
   private d5t a6;
   private g6o u9;
   private n4i h0;
   private BaseSlide c8;
   private int t2;
   private com.aspose.slides.internal.k0r.r4 s7;
   private com.aspose.slides.internal.k0r.l1 x8;
   private n6s n3;
   private final IGenericDictionary<Integer, y2q> y4 = new Dictionary<>();
   private IGenericDictionary<Object, k1z> e2 = new Dictionary<>();
   private List<k1z> t9 = new List<>();
   private List<z4m> z1 = new List<>();
   private com.aspose.slides.internal.k0r.h3d t4;
   private com.aspose.slides.internal.k0r.m0 q0;
   private com.aspose.slides.internal.k0r.w1n z3;
   private int m1 = -1;
   private boolean k7 = false;
   private com.aspose.slides.internal.k0r.e5a m3 = null;
   private com.aspose.slides.internal.k4y.k8g z8 = null;
   private List<y2q> j5;
   private v3z[] w1;
   private y1x r4;
   private BaseSlide c4 = null;

   y2q(BaseSlide var1, g6o var2) {
      this.c8 = var1;
      this.u9 = var2;
      this.k5(false);
      this.l6(false);
      this.l6(0);
      this.d2();
   }

   final long n5(boolean var1) {
      return this.u9.l6(var1);
   }

   final void n5(y2q var1) {
      if (var1 != null) {
         this.s7 = var1.u3();
         this.k7 = true;
      }
   }

   final void n5(k1z var1) {
      if (var1.s7() != null) {
         this.e2.addItem(var1.s7(), var1);
         com.aspose.slides.internal.k0r.c9 var2 = var1.w1();
         var2.n5(new com.aspose.slides.internal.k0r.z0k());
         com.aspose.slides.internal.k0r.g8v var3 = new com.aspose.slides.internal.k0r.g8v();
         var3.n5(this.u9.d2());
         var2.n5(var3);
      }
   }

   private void d2() {
      this.d5();
      this.s3();
   }

   private void d5() {
      if (com.aspose.slides.internal.v6g.k5.l6(this.c8, MasterSlide.class)) {
         this.t2 = 0;
      }

      if (com.aspose.slides.internal.v6g.k5.l6(this.c8, Slide.class)) {
         this.t2 = 4;
      }

      if (com.aspose.slides.internal.v6g.k5.l6(this.c8, LayoutSlide.class)) {
         this.t2 = 3;
         if (this.r4()) {
            this.t2 = 2;
         }
      }

      if (com.aspose.slides.internal.v6g.k5.l6(this.c8, MasterNotesSlide.class)) {
         this.t2 = 5;
      }

      if (com.aspose.slides.internal.v6g.k5.l6(this.c8, NotesSlide.class)) {
         this.t2 = 6;
      }

      if (com.aspose.slides.internal.v6g.k5.l6(this.c8, MasterHandoutSlide.class)) {
         this.t2 = 7;
      }

      this.u9.n5(this);
      this.n3 = new n6s(this);
   }

   private y2q n5(BaseSlide var1) {
      if (var1 == null) {
         return null;
      } else if (this.u9.z1().containsKey(var1)) {
         y2q var2 = this.u9.z1().get_Item(var1);
         this.h0().addItem(var2.k5(), var2);
         return var2;
      } else {
         return null;
      }
   }

   private void s3() {
      LayoutSlide var1 = com.aspose.slides.internal.v6g.k5.n5(this.c8, LayoutSlide.class);
      if (var1 != null) {
         y2q var2 = this.n5((MasterSlide)var1.getMasterSlide());
         if (var2 != null) {
            var2.z1().addItem(this);
         }
      }

      Slide var6 = com.aspose.slides.internal.v6g.k5.n5(this.c8, Slide.class);
      if (var6 != null) {
         this.n5((LayoutSlide)var6.getLayoutSlide());
         this.n5((MasterSlide)var6.getLayoutSlide().getMasterSlide());
         if (var6.getNotesSlideManager().getNotesSlide() != null) {
            y2q var3 = new y2q((BaseSlide)var6.getNotesSlideManager().getNotesSlide(), this.u9);
            this.h0().addItem(6, var3);
         }
      }

      MasterNotesSlide var7 = com.aspose.slides.internal.v6g.k5.n5(this.c8, MasterNotesSlide.class);
      if (var7 != null) {
         this.n5((MasterSlide)var7.getPresentation().getMasters().get_Item(0));
      }

      NotesSlide var4 = com.aspose.slides.internal.v6g.k5.n5(this.c8, NotesSlide.class);
      if (var4 != null) {
         y2q var5 = this.n5().z7();
         if (var5 != null) {
            this.h0().addItem(var5.k5(), var5);
         }

         this.n5((Slide)var4.getParentSlide());
      }

      MasterHandoutSlide var8 = com.aspose.slides.internal.v6g.k5.n5(this.c8, MasterHandoutSlide.class);
      if (var8 != null) {
         this.n5((MasterSlide)var8.getPresentation().getMasters().get_Item(0));
      }
   }

   private void p8() {
      this.s7.l6(true);
      com.aspose.slides.internal.k0r.h2 var1 = new com.aspose.slides.internal.k0r.h2();
      this.s7.n5(var1);
      this.x8 = new com.aspose.slides.internal.k0r.l1();
      var1.e2().addItem(this.x8);
      this.x8.l6(true);
      com.aspose.slides.internal.k0r.b7 var2 = this.x8.l6();
   }

   private void f2() {
      Object var1 = null;
      switch (this.t2) {
         case 0:
            MasterSlide var4 = com.aspose.slides.internal.v6g.k5.n5(this.c8, MasterSlide.class);
            if (var4 == null) {
               throw new ArgumentException("[!] The source DOM slide doesn't correspond to the declared type.");
            }

            this.s7 = new com.aspose.slides.internal.k0r.k2();
            this.s7.l6(true);
            long var13 = ((MasterSlide)this.c8).q0().n5();
            this.z3 = this.u9.k5().n5((com.aspose.slides.internal.k0r.k2)this.s7, var13);
            this.t4 = ((com.aspose.slides.internal.k0r.k2)this.s7).z8();
            break;
         case 1:
         default:
            throw new NotImplementedException("[!] Unknown type of serialized slide.");
         case 2:
            var1 = com.aspose.slides.internal.v6g.k5.n5(this.c8, LayoutSlide.class);
            if (var1 == null) {
               throw new ArgumentException("[!] The source DOM slide doesn't correspond to the declared type.");
            }

            this.s7 = new com.aspose.slides.internal.k0r.k2();
            this.s7.l6(true);
            long var12 = ((LayoutSlide)this.c8).q0().n5();
            this.z3 = this.u9.k5().n5((com.aspose.slides.internal.k0r.k2)this.s7, var12);
            this.t4 = ((com.aspose.slides.internal.k0r.k2)this.s7).z8();
            break;
         case 3:
            var1 = com.aspose.slides.internal.v6g.k5.n5(this.c8, LayoutSlide.class);
            if (var1 == null) {
               throw new ArgumentException("[!] The source DOM slide doesn't correspond to the declared type.");
            }

            this.s7 = new com.aspose.slides.internal.k0r.u6p();
            this.s7.l6(true);
            long var11 = ((LayoutSlide)this.c8).q0().n5();
            this.z3 = this.u9.k5().n5((com.aspose.slides.internal.k0r.u6p)this.s7, var11);
            this.t4 = ((com.aspose.slides.internal.k0r.u6p)this.s7).z8();
            break;
         case 4:
            Slide var7 = com.aspose.slides.internal.v6g.k5.n5(this.c8, Slide.class);
            if (var7 == null) {
               throw new ArgumentException("[!] The source DOM slide doesn't correspond to the declared type.");
            }

            this.s7 = new com.aspose.slides.internal.k0r.u6p();
            this.s7.l6(true);
            long var5 = var7.z3().n5();
            this.z3 = this.u9.k5().l6((com.aspose.slides.internal.k0r.u6p)this.s7, var5);
            this.t4 = ((com.aspose.slides.internal.k0r.u6p)this.s7).z8();
            break;
         case 5:
            MasterNotesSlide var2 = com.aspose.slides.internal.v6g.k5.n5(this.c8, MasterNotesSlide.class);
            if (var2 == null) {
               throw new ArgumentException("[!] The source DOM master notes slide doesn't correspond to the declared type.");
            }

            this.s7 = new com.aspose.slides.internal.k0r.o4();
            this.s7.l6(true);
            this.z3 = new com.aspose.slides.internal.k0r.w1n(null);
            this.z3.l6(1L);
            this.u9.y4().l6().n5(this.z3);
            this.z3.n5(this.u9.k5().n5((com.aspose.slides.internal.k0r.o4)this.s7));
            this.u9.k5().h0().a6().n5(this.z3.l6());
            this.q0 = ((com.aspose.slides.internal.k0r.o4)this.s7).t2();
            break;
         case 6:
            NotesSlide var8 = com.aspose.slides.internal.v6g.k5.n5(this.c8, NotesSlide.class);
            if (var8 == null) {
               throw new ArgumentException("[!] The source DOM notes slide doesn't correspond to the declared type.");
            }

            this.s7 = new com.aspose.slides.internal.k0r.o4();
            this.s7.l6(true);
            this.z3 = this.u9.k5().l6((com.aspose.slides.internal.k0r.o4)this.s7);
            this.q0 = ((com.aspose.slides.internal.k0r.o4)this.s7).t2();
            break;
         case 7:
            MasterHandoutSlide var3 = com.aspose.slides.internal.v6g.k5.n5(this.c8, MasterHandoutSlide.class);
            if (var3 == null) {
               throw new ArgumentException("[!] The source DOM master handout slide doesn't correspond to the declared type.");
            }

            this.s7 = new com.aspose.slides.internal.k0r.g8();
            this.s7.l6(true);
            this.z3 = new com.aspose.slides.internal.k0r.w1n(null);
            this.z3.l6(2L);
            this.u9.y4().l6().n5(this.z3);
            this.z3.n5(this.u9.k5().n5((com.aspose.slides.internal.k0r.g8)this.s7));
            this.u9.k5().h0().a6().l6(this.z3.l6());
      }

      this.p8();
   }

   final void l6(k1z var1) {
      this.t9.addItem(var1);
      Shape var2 = var1.s7();
      if (var2 != null) {
         if (!this.n5().r4().containsKey(var2.v4())) {
            this.n5().r4().addItem(var2.v4(), var1);
         } else {
            this.n5().r4().set_Item(var2.v4(), var1);
         }
      }
   }

   final g6o n5() {
      return this.u9;
   }

   final BaseSlide l6() {
      return this.c8;
   }

   final int k5() {
      return this.t2;
   }

   final com.aspose.slides.internal.k0r.r4 u3() {
      if (this.s7 == null) {
         this.f2();
      }

      return this.s7;
   }

   final com.aspose.slides.internal.k0r.l1 a6() {
      if (this.x8 == null) {
         this.f2();
      }

      return this.x8;
   }

   final n6s u9() {
      if (this.n3 == null) {
         this.f2();
      }

      return this.n3;
   }

   public final IGenericDictionary<Integer, y2q> h0() {
      return this.y4;
   }

   public final IGenericDictionary<Object, k1z> c8() {
      return this.e2;
   }

   public final List<k1z> t2() {
      return this.t9;
   }

   final com.aspose.slides.internal.k0r.h3d s7() {
      return this.t4;
   }

   final com.aspose.slides.internal.k0r.m0 x8() {
      return this.q0;
   }

   final com.aspose.slides.internal.k0r.w1n n3() {
      return this.z3;
   }

   final int y4() {
      return this.m1;
   }

   final v3z[] e2() {
      if (this.w1 == null) {
         this.w1 = new v3z[9];
      }

      return this.w1;
   }

   final List<z4m> t9() {
      return this.z1;
   }

   final List<y2q> z1() {
      if (this.j5 == null) {
         this.j5 = new List<>();
      }

      return this.j5;
   }

   final boolean t4() {
      return this.n5;
   }

   final void l6(boolean var1) {
      this.n5 = var1;
   }

   final void q0() {
      if (this.m1 < 0) {
         if (this.t2 == 0 || this.t2 == 1) {
            this.m1 = this.n5().s3();
         }
      }
   }

   final y2q n5(int var1) {
      return this.y4.containsKey(var1) ? this.y4.get_Item(var1) : null;
   }

   final n4i z3() {
      if (this.h0 == null) {
         this.h0 = new n4i(this.c8, this.u9.t9(), null);
      }

      return this.h0;
   }

   final y1x m1() {
      if (this.r4 == null) {
         this.r4 = y1x.n5(this.c8);
      }

      return this.r4;
   }

   final boolean k7() {
      switch (this.t2) {
         case 0:
         case 2:
         case 3:
         case 5:
         case 6:
         case 7:
            return true;
         case 1:
         case 4:
         default:
            return false;
      }
   }

   final boolean m3() {
      return this.k7;
   }

   final int z8() {
      return this.l6;
   }

   final void l6(int var1) {
      this.l6 = var1;
   }

   final com.aspose.slides.internal.k0r.e5a j5() {
      if (this.m3 == null) {
         this.m3 = new com.aspose.slides.internal.k0r.e5a();
      }

      return this.m3;
   }

   final BaseSlide w1() {
      return this.c4;
   }

   final boolean r4() {
      return this.u9.h2();
   }

   final boolean c4() {
      return this.k5;
   }

   final void k5(boolean var1) {
      this.k5 = var1;
   }

   final com.aspose.slides.ms.System.o5<Boolean> y2() {
      return this.u3.k5();
   }

   final void n5(com.aspose.slides.ms.System.o5<Boolean> var1) {
      this.u3 = var1.k5();
   }

   final com.aspose.slides.internal.k4y.k8g y1() {
      if (this.z8 == null) {
         this.z8 = new com.aspose.slides.internal.k4y.k8g();
      }

      return this.z8;
   }

   final d5t a0() {
      return this.a6;
   }

   final void n5(d5t var1) {
      this.a6 = var1;
   }
}
