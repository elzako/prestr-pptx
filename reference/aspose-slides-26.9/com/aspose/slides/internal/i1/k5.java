package com.aspose.slides.internal.i1;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.a0.t4;
import com.aspose.slides.internal.e5.q0;
import com.aspose.slides.internal.p3.w1;
import com.aspose.slides.internal.u6.x8;
import com.aspose.slides.internal.u6.z8;
import com.aspose.slides.internal.v0.e2;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.y8;

public class k5 implements u9 {
   protected l6 n5 = new l6();
   private static final List<Object> l6 = new List<>();
   private final Dictionary<Integer, c8> k5 = new Dictionary<>();

   protected t2 n5() {
      return null;
   }

   @Override
   public final c8 n5(y8 var1) {
      if (!com.aspose.slides.internal.v6g.k5.n5(c8.class).l6(var1)) {
         throw new ArgumentException(d1.n5(new String[]{"Class must be an implementation of the EventProducer interface: ", var1.q0()}));
      }

      c8 var2 = null;
      c8[] var3 = new c8[]{var2};
      boolean var4 = !this.k5.tryGetValue(var1.hashCode(), var3);
      var2 = var3[0];
      if (var4) {
         var2 = this.n5(var1, this.n5());
         this.k5.addItem(var1.hashCode(), var2);
      }

      return var2;
   }

   protected final c8 n5(y8 var1, t2 var2) {
      if (var1 == com.aspose.slides.internal.v6g.k5.n5(w1.class)) {
         return new n5();
      } else if (var1 == com.aspose.slides.internal.v6g.k5.n5(e2.class)) {
         return new a6();
      } else if (var1 == com.aspose.slides.internal.v6g.k5.n5(q0.class)) {
         return new u3(var2);
      } else if (var1 == com.aspose.slides.internal.v6g.k5.n5(x8.class)) {
         return new z8();
      } else if (var1 == com.aspose.slides.internal.v6g.k5.n5(t4.class)) {
         return new com.aspose.slides.internal.a0.u3();
      } else {
         throw new Exception("Unspecified event producer");
      }
   }
}
