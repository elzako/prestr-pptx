package com.aspose.slides.internal.p3;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.y8;

public class a5 implements y1 {
   private Dictionary<Integer, a5$z1> n5 = new Dictionary<>();

   public a5() {
      this.n5();
   }

   protected final void n5() {
      this.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.e5.x8.class), new a5$h0());
      this.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.e5.z1.class), new a5$z1());
      this.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.v4.u9.class), new a5$l6());
      this.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.v4.t9.class), new a5$x8());
      this.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.v4.n3.class), new a5$t2());
      this.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.v4.x8.class), new a5$c8());
      this.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.v4.z1.class), new a5$s7());
      this.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.v4.a6.class), new a5$n5());
      this.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.v4.h0.class), new a5$u3());
      this.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.v4.z3.class), new a5$y4());
      this.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.v4.s3.class), new a5$m1(this));
      this.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.v4.p8.class), new a5$z1());
      this.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.v4.t2.class), new a5$a6());
      this.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.v4.s7.class), new a5$u9());
      this.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.v4.c8.class), new a5$k5());
      this.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.v4.k7.class), new a5$t9());
      this.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.v4.m1.class), new a5$e2());
      this.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.v4.q0.class), new a5$n3());
      this.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.v4.a0.class), new a5$z3());
      this.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.v4.d2.class), new a5$q0());
      this.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.v4.d5.class), new a5$t4());
      this.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.u6.z1.class), new a5$k7());
      this.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.u6.q0.class), new a5$z1());
      this.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.u6.m3.class), new a5$z1());
      this.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.u6.y1.class), new a5$z1());
      this.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.u6.m1.class), new a5$z1());
      this.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.u6.r4.class), new a5$z1());
      this.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.u6.c4.class), new a5$z1());
      this.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.v4.f2.class), new a5$m3(this));
      this.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.t1.r4.class), new a5$x8());
   }

   protected final void n5(y8 var1, a5$z1 var2) {
      this.n5.addItem(var1.hashCode(), var2);
   }

   @Override
   public final void n5(com.aspose.slides.internal.e5.t2 var1, List<y2> var2) {
      a5$z1 var3 = null;
      a5$z1[] var4 = new a5$z1[]{var3};
      boolean var5 = this.n5.tryGetValue(com.aspose.slides.ms.System.j8.n5(var1).hashCode(), var4);
      var3 = var4[0];
      if (var5) {
         var3.n5(var1, var2);
      }
   }

   @Override
   public final y2 n5(com.aspose.slides.internal.e5.t2 var1) {
      List var2 = new List();
      this.n5(var1, var2);
      if (var2.size() == 0) {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.d1.n5(new Object[]{"LayoutManager for class ", com.aspose.slides.ms.System.j8.n5(var1), " is missing."})
         );
      } else if (var2.size() > 1) {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.d1.n5(new Object[]{
               "Duplicate LayoutManagers for class ", com.aspose.slides.ms.System.j8.n5(var1), " found, only one may be declared."
            })
         );
      } else {
         return (y2)var2.get_Item(0);
      }
   }

   @Override
   public final e9 n5(com.aspose.slides.internal.a0.a6 var1, com.aspose.slides.internal.t1.t2 var2) {
      return new e9(var1, var2);
   }

   @Override
   public final z8 n5(e9 var1, com.aspose.slides.internal.t1.a6 var2) {
      return new z8(var1, var2);
   }

   @Override
   public final com.aspose.slides.internal.x9.y4 n5(e9 var1, com.aspose.slides.internal.t1.r4 var2) {
      return new com.aspose.slides.internal.x9.y4(var1, var2);
   }

   @Override
   public final f5 n5(e9 var1, com.aspose.slides.internal.t1.w1 var2, com.aspose.slides.internal.t1.m3 var3) {
      return new f5(var1, var2, var3);
   }

   @Override
   public final f5 n5(e9 var1, com.aspose.slides.internal.t1.w1 var2, com.aspose.slides.internal.a0.t2 var3) {
      return new f5(var1, var2, var3);
   }
}
