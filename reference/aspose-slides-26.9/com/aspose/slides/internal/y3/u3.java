package com.aspose.slides.internal.y3;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.n2d.t2;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z0k.t4;

public class u3 {
   private final t4 l6;
   private final int k5;
   private k5 u3;
   private l6 a6;
   private n5 u9;
   private int h0;
   private boolean c8 = false;
   private boolean t2 = false;
   private y1 s7;
   private boolean x8;
   private boolean n3;
   private int y4;
   public static final y1 n5 = new y1(0.0F, 0.0F, 1280.0F, 1024.0F);
   private f2 e2;

   public u3(byte[] var1) {
      this(new e2(var1));
   }

   public u3(t4 var1) {
      this.s7 = y1.n5.y4();
      this.x8 = false;
      this.n3 = false;
      this.y4 = 0;
      this.e2 = new f2(1280.0F, 1024.0F);
      this.l6 = var1;
      this.k5 = com.aspose.slides.internal.k4d.a6.u9(var1);
      this.z3();
   }

   private void z3() {
      this.l6.setPosition(0L);
      com.aspose.slides.internal.z0k.n5 var1 = new com.aspose.slides.internal.z0k.n5(this.l6);
      if (this.t2()) {
         this.u9 = new n5();
         this.u9.n5(var1);
      } else {
         if (this.u3()) {
            this.a6 = new l6();
            this.a6.n5(var1);
         }

         this.u3 = new k5();
         this.u3.n5(var1);
      }

      this.h0 = (int)this.l6.getPosition();
   }

   public final t4 n5() {
      return this.l6;
   }

   public final byte[] l6() {
      if (!this.l6.canSeek()) {
         throw new InvalidOperationException();
      }

      long var1 = this.l6.getPosition();
      this.l6.setPosition(0L);
      byte[] var3 = com.aspose.slides.internal.q7.n5.n5(this.l6);
      this.l6.setPosition(var1);
      return var3;
   }

   public final int k5() {
      return this.h0;
   }

   public final boolean u3() {
      return this.k5 == 2;
   }

   public final boolean a6() {
      return this.k5 == 3;
   }

   public final boolean u9() {
      return this.k5 == 5;
   }

   public final boolean h0() {
      return this.k5 == 4;
   }

   public final boolean c8() {
      return this.u9() || this.h0();
   }

   public final boolean t2() {
      return this.a6() || this.c8();
   }

   public final float s7() {
      switch (this.k5) {
         case 1:
         case 2:
            return this.m1();
         case 3:
         case 4:
         case 5:
            return this.u9.l6();
         default:
            throw new InvalidOperationException("Unknown metafile type.");
      }
   }

   public final float x8() {
      switch (this.k5) {
         case 1:
         case 2:
            return this.m1();
         case 3:
         case 4:
         case 5:
            return this.u9.k5();
         default:
            throw new InvalidOperationException("Unknown metafile type.");
      }
   }

   public final y1 n3() {
      switch (this.k5) {
         case 1:
            return this.k7();
         case 2:
            if (this.a6.n5()) {
               return this.a6.l6();
            }

            return n5;
         case 3:
         case 4:
         case 5:
            return this.u9.n5();
         default:
            throw new InvalidOperationException("Unknown metafile type.");
      }
   }

   public final l6 y4() {
      return this.a6;
   }

   public final f2 e2() {
      return this.n3().c8();
   }

   public final f2 t9() {
      return new f2(
         (float)com.aspose.slides.internal.n2d.t2.l6(this.e2().l6(), this.s7()), (float)com.aspose.slides.internal.n2d.t2.l6(this.e2().k5(), this.x8())
      );
   }

   public final int z1() {
      return this.k5;
   }

   public final int t4() {
      return this.t2() ? 0 : this.u3.n5();
   }

   private float m1() {
      return this.u3() ? this.a6.k5() : 96.0F;
   }

   private y1 k7() {
      if (!this.c8) {
         this.m3();
         this.c8 = true;
      }

      return this.s7;
   }

   private void m3() {
      com.aspose.slides.internal.x4.e2 var1 = new com.aspose.slides.internal.x4.e2();
      a6 var2 = new a6(var1);
      var1.n5(this, var2, new com.aspose.slides.internal.g0.k5(), new y1(w1.n5.u3(), this.q0().a6()));
      var2.l6().a6(this.s7);
      this.x8 = var2.y4();
      this.y4 = var2.e2();
   }

   public final f2 q0() {
      return this.e2;
   }
}
