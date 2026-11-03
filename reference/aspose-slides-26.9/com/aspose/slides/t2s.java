package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.ms.System.IDisposable;

final class t2s {
   private boolean n5;
   private boolean l6;
   private boolean k5;
   private d5f u3;
   private i1x a6;
   private com.aspose.slides.internal.k0r.w1n u9;
   private long h0 = 0L;
   private com.aspose.slides.internal.k0r.j2p c8;
   private List<com.aspose.slides.internal.k0r.r5w> t2;
   private com.aspose.slides.internal.k0r.u3 s7;
   private com.aspose.slides.internal.k0r.k5 x8;
   private BaseSlide n3;
   private int y4;
   private com.aspose.slides.internal.k0r.l1 e2;
   private s3f[] t9 = new s3f[9];
   private final IGenericDictionary<Integer, t2s> z1 = new Dictionary<>();
   private l3c t4;
   private m5n q0;
   private com.aspose.slides.internal.k0r.r2 z3;
   private com.aspose.slides.internal.k0r.l2p m1;
   private final Dictionary<Long, v5s> k7 = new Dictionary<>();
   private final List<v5s> m3 = new List<>();
   private final Dictionary<IShape, com.aspose.slides.internal.k0r.l6> z8 = new Dictionary<>();
   private SortedList<Long, v5s> j5 = null;
   private y1x w1;
   private List<Long> r4 = null;
   private BaseSlide c4 = null;
   private final SortedList<Integer, LayoutSlide> y2 = new SortedList<>();
   private com.aspose.slides.ms.System.o5<Long> y1 = new com.aspose.slides.ms.System.o5<>();
   private com.aspose.slides.ms.System.o5<Long> a0 = new com.aspose.slides.ms.System.o5<>();
   private int d2;
   private boolean d5 = false;
   private int s3;
   private IGenericDictionary<Byte, Placeholder> p8;

   t2s(com.aspose.slides.internal.k0r.w1n var1, d5f var2) {
      this.u9 = var1;
      this.u3 = var2;
      this.n5(false);
      this.l6(false);
      this.k5(false);
      this.f2();
      this.i1();
   }

   final void n5(v5s var1) {
      long var2 = var1.t2();
      com.aspose.slides.internal.n2d.z1 var4 = this.a6().z3();
      if (var4.containsKey(var2)) {
         var2 = this.a6().y2();
         var1.n5(var2);
         var4.addItem(var2, var1);
      } else {
         var4.addItem(var2, var1);
      }

      this.m3().addItem(var2, var1);
      if (var1.u9() != null) {
         if (var1.u9().m3() != 4) {
            if (var1.u9().m3() != 7) {
               this.m3.addItem(var1);
            }
         }
      }
   }

   final void n5() {
      x2u.l6(this);

      for (s3f var4 : this.t9) {
         if (var4 != null && !var4.t2()) {
            int var5 = var4.c8();
            if (var5 >= 0 && this.t9[var5] != null) {
               s3f var6 = this.t9[var5];
               var6.n5();
               var4.n5(var6);
            }

            var4.n5();
            var4.l6();
         }
      }

      e5e.n5(this);

      for (s3f var10 : this.t9) {
         if (var10 != null) {
            l4e.l6(var10);
         }
      }
   }

   final void n5(BaseSlide var1) {
      if (var1 != null) {
         if (this.c4 == null) {
            this.c4 = this.n3;
            this.n3 = var1;
            this.w1 = null;
         }
      }
   }

   final void l6() {
      if (this.c4 != null) {
         this.n3 = this.c4;
         this.c4 = null;
      }
   }

   final int k5() {
      return this.s3++;
   }

   private void f2() {
      if (this.u9 == null) {
         throw new ArgumentNullException("slidePersistAtom", "Can't deserialize a slide without SlidePersistAtom!");
      }

      this.h0 = this.u9.l6();
      this.c8 = (com.aspose.slides.internal.k0r.j2p)this.u9.d5();
   }

   private void i1() {
      if (this.u3 == null) {
         throw new ArgumentNullException("deserializationContext", "Something is wrong! DeserializationContext is not found!");
      }

      this.a6 = new i1x(this.u3.t9(), null);
      this.s7 = this.u3.k5().l6(this.h0);
      if (this.s7 == null) {
         throw new ArgumentOutOfRangeException("Can't recognize a Slide Container!");
      }

      this.e2 = this.s7.l6().l6();
      if (this.s7.u3() != null) {
         this.r4 = this.s7.u3().l6();
      }

      this.e5();
      this.b3();
      this.z7();
      if (this.y4 >= 4) {
         this.u3();
      }

      if (this.r4()) {
         this.u3.l6(this);
      }
   }

   private void e5() {
      label33:
      switch (this.c8.y2()) {
         case 0:
            this.y4 = 4;
            break;
         case 1:
            this.y4 = 0;
            if ((this.s7.r4() & 65535) != 1016) {
               this.y4 = 3;
            }
            break;
         case 2:
            this.y4 = 6;
            break;
         case 255:
            switch ((int)this.u9.u3()) {
               case 1:
                  this.y4 = 5;
                  break label33;
               case 2:
                  this.y4 = 7;
                  break label33;
               default:
                  throw new ArgumentOutOfRangeException("Unknown service slide type!");
            }
         default:
            throw new ArgumentOutOfRangeException("Unknown parent SlidesList!");
      }

      if (this.r4()) {
         com.aspose.slides.internal.k0r.o8 var1 = com.aspose.slides.internal.v6g.k5.n5(this.s7, com.aspose.slides.internal.k0r.o8.class);
         if (var1 == null) {
            throw new NullReferenceException("Wrong type of source SlideContainer!");
         }

         this.x8 = var1.z8();
         this.m1 = ((com.aspose.slides.internal.k0r.o8)this.s7).q0();
      }

      if (this.c4()) {
         com.aspose.slides.internal.k0r.o4 var2 = com.aspose.slides.internal.v6g.k5.n5(this.s7, com.aspose.slides.internal.k0r.o4.class);
         if (var2 == null) {
            throw new NullReferenceException("Wrong type of source NotesContainer!");
         }

         this.x8 = var2.t2();
      }
   }

   private void b3() {
      com.aspose.slides.internal.k0r.k2 var1 = com.aspose.slides.internal.v6g.k5.n5(this.s7, com.aspose.slides.internal.k0r.k2.class);
      if (var1 != null) {
         com.aspose.slides.internal.k0r.x7n var2 = var1.k7();
         long var3 = 0L;
         if (var2 != null) {
            var3 = var2.l6();
            this.u3.n5(var3, -1, this);
         }

         com.aspose.slides.internal.k0r.u1s var5 = var1.m3();
         if (var5 != null) {
            var3 = var5.l6();
         }

         if (var1.z1() != null) {
            IGenericEnumerator var6 = var1.z1().getKeys().iterator();

            try {
               while (var6.hasNext()) {
                  int var7 = com.aspose.slides.internal.v6g.k5.u3(var6.next(), int.class);
                  this.u3.n5(var3, var7, this);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                  var6.dispose();
               }
            }
         }
      }
   }

   final void n5(SortedList<Integer, t2s> var1) {
      this.u3();
   }

   final void u3() {
      if (!this.d5) {
         this.d5 = true;
         if (this.r4()) {
            com.aspose.slides.internal.k0r.h3d var1 = (com.aspose.slides.internal.k0r.h3d)this.x8;
            if ((var1.t2() & 4294967295L) != 0L && this.u3.m1().containsKey(var1.t2())) {
               t2s var2 = com.aspose.slides.internal.v6g.k5.n5(this.u3.m1().get_Item(var1.t2()), t2s.class);
               if (var2.n3() == 3) {
                  this.h0().addItem(3, var2);
               } else {
                  this.h0().addItem(0, var2);
               }
            }
         }

         if (this.c4()) {
            com.aspose.slides.internal.k0r.m0 var11 = (com.aspose.slides.internal.k0r.m0)this.x8;
            if (this.u3.m1().containsKey(var11.h0())) {
               t2s var13 = com.aspose.slides.internal.v6g.k5.n5(this.u3.m1().get_Item(var11.h0()), t2s.class);
               if (this.n3() == 5) {
                  this.h0().addItem(0, var13);
               } else {
                  this.h0().addItem(4, var13);
                  var13.h0().addItem(6, this);
               }
            }
         } else {
            if (this.y2()) {
               com.aspose.slides.internal.k0r.g8 var9 = com.aspose.slides.internal.v6g.k5.n5(this.s7, com.aspose.slides.internal.k0r.g8.class);
               if (var9 == null) {
                  throw new NullReferenceException("Wrong type of source HandoutContainer!");
               }
            }

            com.aspose.slides.internal.k0r.k2 var10 = com.aspose.slides.internal.v6g.k5.n5(this.s7, com.aspose.slides.internal.k0r.k2.class);
            if (var10 != null) {
               if (var10.m3() != null && this.u3.j5()) {
                  long var3 = var10.m3().l6();
                  t2s var5 = this.u3.k7().get_Item(var3).n5().get_Item(-1);
                  if (var5 != this) {
                     this.y4 = 2;
                     this.h0().addItem(1, var5);
                  }
               }

               if (var10.z1() != null && !this.a0() && this.y4 != 2) {
                  this.y4 = 1;
               }
            }

            com.aspose.slides.internal.k0r.u6p var12 = com.aspose.slides.internal.v6g.k5.n5(this.s7, com.aspose.slides.internal.k0r.u6p.class);
            if (var12 != null) {
               if (var12.s7() != null) {
                  long var6 = var12.s7().l6();
                  if (this.u3.k7().containsKey(var6)) {
                     t2s var8 = this.u3.k7().get_Item(var6).n5().get_Item(-1);
                     this.h0().addItem(1, var8);
                  }
               }

               if (var12.m3() != null) {
                  long var14 = var12.m3().l6();
                  if (this.u3.k7().containsKey(var14)) {
                     t2s var15 = this.u3.k7().get_Item(var14).n5().get_Item(-1);
                     this.h0().addItem(2, var15);
                  }
               }
            }
         }
      }
   }

   private void o0() {
      MasterSlide var1 = com.aspose.slides.internal.v6g.k5.n5(this.n3, MasterSlide.class);
      if (var1 != null) {
         com.aspose.slides.internal.k0r.k2 var2 = com.aspose.slides.internal.v6g.k5.n5(this.s7, com.aspose.slides.internal.k0r.k2.class);
         if (var2 != null) {
            com.aspose.slides.internal.k0r.o6t[] var3 = var2.x8();

            for (int var4 = 0; var4 < var3.length; var4++) {
               s3f var5 = new s3f(var3[var4], this);
               switch (var5.u9()) {
                  case 0:
                     var5.n5(var1.h0);
                     break;
                  case 1:
                     var5.n5(var1.c8);
                     break;
                  case 2:
                     var5.n5(var1.t2);
                     break;
                  case 3:
                  default:
                     var5.n5(new TextStyle(var1));
                     break;
                  case 4:
                     var5.n5(var1.n3);
                     break;
                  case 5:
                     var5.n5(var1.x8);
                     break;
                  case 6:
                     var5.n5(var1.s7);
               }
            }
         }
      }
   }

   private void z7() {
      List$Enumerator var1 = this.e2.e2().iterator();

      try {
         while (var1.hasNext()) {
            com.aspose.slides.internal.k0r.e6r var2 = (com.aspose.slides.internal.k0r.e6r)var1.next();
            com.aspose.slides.internal.k0r.g6 var3 = com.aspose.slides.internal.v6g.k5.n5(var2, com.aspose.slides.internal.k0r.g6.class);
            v5s var4 = null;
            if (var3 != null) {
               var4 = new v5s(var3, this);
            }

            switch (var2.r4()) {
               case 61443:
                  if (this.t4 == null && var4 != null) {
                     this.t4 = (l3c)var4.a6();
                  }
                  break;
               case 61444:
                  if (this.q0 == null && var4 != null) {
                     com.aspose.slides.internal.k0r.q5 var5 = (com.aspose.slides.internal.k0r.q5)var2;
                     if (var5.u3() != null && var5.u3().h0()) {
                        this.q0 = (m5n)var4.a6();
                     }
                  }
                  break;
               case 61445:
                  if (this.z3 == null) {
                     this.z3 = (com.aspose.slides.internal.k0r.r2)var2;
                  }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }

   private void v4() {
      Presentation var1 = this.a6().n5();
      switch (this.y4) {
         case 0:
         case 1:
            var1.n3().l6(this.u9.u3());
            this.n3 = new MasterSlide((MasterSlideCollection)var1.getMasters());
            ((MasterSlideCollection)var1.getMasters()).n5((MasterSlide)this.n3);
            break;
         case 2:
            if (!this.u3.j5()) {
               throw new ArgumentException("Illegal instance of CompositMaster.");
            }

            var1.n3().l6(this.u9.u3());
            this.n3 = new MasterSlide((MasterSlideCollection)var1.getMasters());
            break;
         case 3:
            var1.n3().l6(this.u9.u3());
            com.aspose.slides.internal.k0r.h3d var5 = (com.aspose.slides.internal.k0r.h3d)this.x8;
            if (this.c8() == null) {
               throw new PptxReadException("MasterSlide cannot be null.");
            }

            MasterSlide var6 = com.aspose.slides.internal.v6g.k5.n5(this.c8().y4(), MasterSlide.class);
            byte var4 = 0;
            this.n3 = (LayoutSlide)var6.getLayoutSlides().getByType(var4);
            if (this.n3 == null) {
               this.n3 = (LayoutSlide)var6.l6(var4);
            }
            break;
         case 4:
            var1.n3().n5(this.u9.u3());
            this.n3 = new Slide((SlideCollection)var1.getSlides());
            this.d2 = var1.getSlides().size();
            ((SlideCollection)var1.getSlides()).n5((Slide)this.n3);
            this.u6();
            break;
         case 5:
            this.n3 = (MasterNotesSlide)var1.getMasterNotesSlideManager().setDefaultMasterNotesSlide();
            break;
         case 6:
            t2s var2 = this.n5(4);
            if (var2 != null) {
               Slide var3 = com.aspose.slides.internal.v6g.k5.n5(var2.y4(), Slide.class);
               this.n3 = (NotesSlide)((NotesSlideManager)var3.getNotesSlideManager()).n5(false);
            }
            break;
         case 7:
            this.n3 = (MasterHandoutSlide)var1.getMasterHandoutSlideManager().setDefaultMasterHandoutSlide();
            break;
         default:
            throw new ArgumentException(com.aspose.slides.ms.System.d1.n5(new String[]{"Unprocessed slide type: ", com.aspose.slides.ms.System.s3.n5(n2u.class, this.y4)}));
      }

      if (this.n3 != null) {
         if (this.c8.y2() < 4) {
            if (this.u9.u3() == 4294967295L) {
               this.n3.u3().n5(var1.n3().w1());
            } else {
               this.n3.u3().n5(this.u9.u3());
            }
         }

         this.o0();
      }
   }

   private void u6() {
      LayoutSlide var1 = null;
      com.aspose.slides.internal.k0r.u6p var2 = (com.aspose.slides.internal.k0r.u6p)this.s7;
      t2s var3 = this.n5(0);
      if (var3 == null) {
         var3 = this.n5(3);
      }

      t2s var4 = this.n5(2);
      if (var4 == null) {
         var4 = this.n5(1);
      }

      if (var4 == null && var3 != null && var3.n3() == 2) {
         var4 = var3;
      }

      if (var4 != null) {
         if (this.u3.j5() && var4.n3() == 2) {
            var4 = var4.n5(1);
         }

         if (var4 == null) {
            throw new NullReferenceException("Haven't original master for composite master slide!");
         }

         if (var2.s7() != null) {
            int var5 = var2.s7().k5();
            if (var4.t9().containsKey(var5)) {
               var1 = var4.t9().get_Item(var5);
            }
         }

         if (var3 == null) {
            throw new NullReferenceException("MasterSlide couldn't be empty.");
         }

         if (var1 == null && var3.t9().size() == 1) {
            var1 = var3.t9().getValues().get_Item(0);
         }
      }

      if (var4 == null) {
         var4 = var3;
      }

      if (var4 == null) {
         throw new NullReferenceException("Can't find any assigned MasterSlide!");
      }

      if (var1 == null) {
         var1 = com.aspose.slides.internal.v6g.k5.n5(var4.y4(), LayoutSlide.class);
      }

      if (var1 == null) {
         MasterSlide var17 = com.aspose.slides.internal.v6g.k5.n5(var4.y4(), MasterSlide.class);
         if (var17 != null) {
            byte var6 = y3o.n5((com.aspose.slides.internal.k0r.h3d)this.x8);
            var1 = (LayoutSlide)var17.getLayoutSlides().getByType(var6);
            if (var1 == null) {
               var1 = w6g.n5(var17, var6, this.a6());
               long var7 = 10L;
               List var9 = l6(var17);
               List$Enumerator var10 = var9.iterator();

               try {
                  while (var10.hasNext()) {
                     Shape var11 = (Shape)var10.next();
                     Placeholder var12 = com.aspose.slides.internal.v6g.k5.n5(var11.getPlaceholder(), Placeholder.class);
                     if (v0q.n5(var12)) {
                        Shape var13 = var1.n5(var12.getType());
                        if (var13 != null) {
                           ((Placeholder)var13.getPlaceholder()).n5(var7++);
                        }
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
                     var10.dispose();
                  }
               }

               ((SlideShowTransition)var1.getSlideShowTransition()).l6(var17.getSlideShowTransition());
            }
         }
      }

      if (var1 != null) {
         ((Slide)this.n3).n5(var1);
      } else {
         throw new NullReferenceException("Can't find a Layout Slide!!!");
      }
   }

   final t2s n5(int var1) {
      return this.z1.containsKey(var1) ? this.z1.get_Item(var1) : null;
   }

   private void t1() {
      if (this.y4 == 4) {
         Slide var1 = com.aspose.slides.internal.v6g.k5.n5(this.y4(), Slide.class);
         if (var1 != null) {
            LayoutSlide var2 = var1.w1();
            if (var2 != null) {
               List var3 = l6(var2);
               this.p8 = new Dictionary<>();
               if (var3.size() != 0) {
                  List$Enumerator var4 = var3.iterator();

                  try {
                     while (var4.hasNext()) {
                        Shape var5 = (Shape)var4.next();
                        Placeholder var6 = (Placeholder)var5.getPlaceholder();
                        if ((var6.getIndex() & 4294967295L) >= 0L && !this.p8.containsKey(var6.getType())) {
                           this.p8.addItem(var6.getType(), var6);
                        }
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                        var4.dispose();
                     }
                  }
               }
            }
         }
      }
   }

   static List<Shape> l6(BaseSlide var0) {
      List var1 = new List();
      if (var0 != null) {
         n5(var0.k5, var1);
      }

      return var1;
   }

   private static void n5(GroupShape var0, List<Shape> var1) {
      IGenericEnumerator var2 = var0.n5.iterator();

      try {
         while (var2.hasNext()) {
            IShape var3 = (IShape)var2.next();
            GroupShape var4 = com.aspose.slides.internal.v6g.k5.n5(var3, GroupShape.class);
            if (var4 != null) {
               n5(var4, var1);
            } else if (var3.getPlaceholder() != null) {
               var1.addItem((Shape)var3);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   final d5f a6() {
      return this.u3;
   }

   final i1x u9() {
      return this.a6;
   }

   final IGenericDictionary<Integer, t2s> h0() {
      return this.z1;
   }

   final t2s c8() {
      t2s var1 = this.n5(1);
      if (var1 == null) {
         var1 = this.n5(0);
      }

      return var1;
   }

   final com.aspose.slides.internal.k0r.w1n t2() {
      return this.u9;
   }

   final com.aspose.slides.internal.k0r.u3 s7() {
      return this.s7;
   }

   final com.aspose.slides.internal.k0r.k5 x8() {
      return this.x8;
   }

   final int n3() {
      return this.y4;
   }

   final BaseSlide y4() {
      if (this.n3 == null) {
         this.v4();
      }

      return this.n3;
   }

   final s3f[] e2() {
      return this.y4 <= 3 ? this.t9 : null;
   }

   final SortedList<Integer, LayoutSlide> t9() {
      return this.y2;
   }

   final m5n z1() {
      return this.q0;
   }

   final com.aspose.slides.internal.k0r.l2p t4() {
      return this.m1;
   }

   final com.aspose.slides.internal.k0r.d0 q0() {
      return this.s7.a6();
   }

   final com.aspose.slides.internal.k0r.r2 z3() {
      return this.z3;
   }

   final List<com.aspose.slides.internal.k0r.r5w> m1() {
      if (this.t2 != null) {
         return this.t2;
      }

      this.t2 = this.c8.l6().n5(this.h0);
      if (this.t2 == null) {
         this.t2 = new List<>();
      }

      return this.t2;
   }

   final com.aspose.slides.Collections.Generic.IGenericCollection<v5s> k7() {
      if (this.t4.n5()) {
         this.t4.l6();
      }

      return this.m3;
   }

   final Dictionary<Long, v5s> m3() {
      return this.k7;
   }

   final Dictionary<IShape, com.aspose.slides.internal.k0r.l6> z8() {
      return this.z8;
   }

   final SortedList<Long, v5s> j5() {
      if (this.j5 == null) {
         this.j5 = new SortedList<>();
      }

      return this.j5;
   }

   final BaseSlide w1() {
      return this.c4;
   }

   final boolean r4() {
      return this.y4 <= 4;
   }

   final boolean c4() {
      return this.y4 == 5 || this.y4 == 6;
   }

   final boolean y2() {
      return this.y4 >= 7;
   }

   final int y1() {
      return this.d2;
   }

   final void n5(boolean var1) {
      this.n5 = var1;
   }

   final boolean a0() {
      return this.l6;
   }

   final void l6(boolean var1) {
      this.l6 = var1;
   }

   final y1x d2() {
      if (this.w1 == null) {
         this.w1 = y1x.n5(this.n3);
      }

      return this.w1;
   }

   final List<Long> d5() {
      return this.r4;
   }

   final IGenericDictionary<Byte, Placeholder> s3() {
      if (this.p8 == null) {
         this.t1();
      }

      return this.p8;
   }

   final boolean p8() {
      return this.u3.z8();
   }

   final void k5(boolean var1) {
      this.k5 = var1;
   }
}
