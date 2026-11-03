package com.aspose.slides.internal.q8o;

import com.aspose.slides.internal.g8v.i1;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.y4g.h2;
import com.aspose.slides.internal.y4g.o5;
import com.aspose.slides.internal.y4g.v8;
import com.aspose.slides.internal.y4g.z6;

public class u3 extends com.aspose.slides.internal.n4m.n5 {
   private byte[] n5;

   public u3(v8 var1) {
      super(var1, (byte)1);
   }

   @Override
   public void c8() {
      z6 var1 = (z6)this.x8();
      super.c8();
      var1.l6(this.n5);
      var1.n5(this.x8().c8());
      this.n5 = null;
   }

   @Override
   protected void t2() {
      this.n5(this.x8().c8());
      h2 var1 = new h2();
      var1.k5(this.x8().d2());
      var1.n5(this.x8().u3(28));
      this.n5 = var1.u9();
      var1.a6();
      this.n5(this.n5);
      this.x8().n5(o5.n5(this.x8().n3().n5()));
      if (this.x8().t2() != null) {
         this.n5(com.aspose.slides.internal.v6g.k5.n5((Object)(this.x8().t2().length), 9));
         if (this.x8().t2().length > 0) {
            this.n5(this.x8().t2());
         }
      } else {
         this.n5(com.aspose.slides.internal.v6g.k5.n5((Object)(0), 9));
      }

      this.n5(com.aspose.slides.internal.v6g.k5.l6(this.x8().t4().size() * 2, 9));

      for (int var2 = 0; var2 < this.x8().t4().size(); var2++) {
         this.n5(this.x8().t4().get_Item(var2).s7());
      }

      this.n5(com.aspose.slides.internal.v6g.k5.n5((Object)(1), 9));
      this.n5((byte)this.x8().s7());
   }

   @Override
   protected void s7() {
      this.t2();
      String var1 = this.x8().n3().n5();
      i1 var2 = null;
      i1[] var3 = new i1[]{var2};
      boolean var4 = i1.n5(var1, var3);
      var2 = var3[0];
      if (!var4) {
         h2 var5 = new h2();
         byte[] var6 = j5.z3().u3(var1);
         var5.n5(com.aspose.slides.internal.v6g.k5.l6(0, 9));
         var5.n5(com.aspose.slides.internal.v6g.k5.l6(var6.length + 5, 9));
         var5.n5(com.aspose.slides.internal.v6g.k5.l6(var6.length + 3, 9));
         var5.n5(com.aspose.slides.internal.v6g.k5.n5((Object)(0), 9));
         var5.n5(com.aspose.slides.internal.v6g.k5.l6(var6.length, 9));
         var5.n5(var6);
         this.n5(com.aspose.slides.internal.v6g.k5.l6(var5.getLength(), 11));
         this.n5(var5.u9());
      }
   }
}
