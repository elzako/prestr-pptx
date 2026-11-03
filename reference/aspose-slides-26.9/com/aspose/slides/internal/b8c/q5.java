package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidCastException;

public class q5 extends m9 {
   protected e3m d5;

   protected q5(m9 var1) {
      super(var1);
      this.d5 = var1;
   }

   protected q5(m9 var1, com.aspose.slides.ms.System.y8 var2) {
      super(var1, var2);
      this.d5 = var1;
   }

   protected q5(j9e var1) {
      super(var1);
   }

   public static e3m n5(e3m var0) {
      if (var0 == p6t.n5) {
         return p6t.l6;
      } else if (var0 == p1.n5) {
         return q9.n5;
      } else {
         return var0 == p1.l6 ? q9.l6 : new q5((m9)var0);
      }
   }

   @Override
   public Object n5(Object var1, com.aspose.slides.ms.System.y8 var2, com.aspose.slides.ms.System.Xml.a3 var3) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      } else if (var2 == null) {
         throw new ArgumentNullException("destinationType");
      } else {
         return this.l6(var1, var2, var3);
      }
   }

   @Override
   protected Object l6(Object var1, com.aspose.slides.ms.System.y8 var2, com.aspose.slides.ms.System.Xml.a3 var3) {
      if (var1.getClass().getName().startsWith("[")) {
         var1 = com.aspose.slides.ms.System.u3.n5((Object)(var1));
      }

      com.aspose.slides.ms.System.y8 var4 = com.aspose.slides.ms.System.j8.n5(var1);
      if (var2 == e2) {
         var2 = this.u3();
      }

      if (!com.aspose.slides.internal.v6g.k5.l6(var1, IEnumerable.class) || !this.n5(var2)) {
         throw this.k5(var4, var2);
      }

      if (var2 == n3) {
         return var4 == n3 ? var1 : this.n5((IEnumerable)var1, var3);
      }

      if (var4 == n3) {
         var1 = this.d2((String)var1);
      }

      if (var2.s3()) {
         com.aspose.slides.ms.System.y8 var5 = var2.h0();
         if (var5 == e2) {
            return this.n5(Object.class, var1, var3);
         } else if (var4 == var2) {
            return var1;
         } else if (var5 == r4) {
            return this.n5(Boolean.class, var1, var3);
         } else if (var5 == t9) {
            return this.n5(Byte.class, var1, var3);
         } else if (var5 == c4) {
            return this.n5(byte[].class, var1, var3);
         } else if (var5 == j5) {
            return this.n5(com.aspose.slides.ms.System.j5.class, var1, var3);
         } else if (var5 == w1) {
            return this.n5(com.aspose.slides.ms.System.w1.class, var1, var3);
         } else if (var5 == t2) {
            return this.n5(com.aspose.slides.ms.System.c4.class, var1, var3);
         } else if (var5 == m3) {
            return this.n5(Double.class, var1, var3);
         } else if (var5 == z1) {
            return this.n5(Short.class, var1, var3);
         } else if (var5 == s7) {
            return this.n5(Integer.class, var1, var3);
         } else if (var5 == x8) {
            return this.n5(Long.class, var1, var3);
         } else if (var5 == t4) {
            return this.n5(Byte.class, var1, var3);
         } else if (var5 == z8) {
            return this.n5(Float.class, var1, var3);
         } else if (var5 == n3) {
            return this.n5(String.class, var1, var3);
         } else if (var5 == a0) {
            return this.n5(com.aspose.slides.ms.System.s4.class, var1, var3);
         } else if (var5 == q0) {
            return this.n5(Integer.class, var1, var3);
         } else if (var5 == z3) {
            return this.n5(Long.class, var1, var3);
         } else if (var5 == m1) {
            return this.n5(Long.class, var1, var3);
         } else if (var5 == y1) {
            return this.n5(com.aspose.slides.ms.System.r8.class, var1, var3);
         } else if (var5 == y4) {
            return this.n5(x6.class, var1, var3);
         } else if (var5 == y2) {
            return this.n5(com.aspose.slides.ms.System.Xml.k6.class, var1, var3);
         } else if (var5 == k7) {
            return this.n5(com.aspose.slides.internal.x6s.u3.class, var1, var3);
         } else if (var5 == d2) {
            return this.n5(com.aspose.slides.internal.x6s.a6.class, var1, var3);
         } else {
            throw this.k5(var4, var2);
         }
      } else {
         return var4 == this.u3() && var4 != u9 ? var1 : this.l6(var1, var3);
      }
   }

   private boolean n5(com.aspose.slides.ms.System.y8 var1) {
      return var1 != a6 && var1 != k5 && var1 != u3 && var1 != n3 ? var1.s3() : true;
   }

   private <T> T[] n5(Class<T> var1, Object var2, com.aspose.slides.ms.System.Xml.a3 var3) {
      IList var4 = com.aspose.slides.internal.v6g.k5.n5(var2, IList.class);
      if (var4 != null) {
         Object[] var9 = (Object[])com.aspose.slides.internal.v6g.k5.n5(var1, new int[]{var4.size()});

         for (int var10 = 0; var10 < var4.size(); var10++) {
            var9[var10] = this.d5.n5(var4.get_Item(var10), com.aspose.slides.internal.v6g.k5.n5(var1), var3);
         }

         return (T[])var9;
      } else {
         IEnumerable var5 = com.aspose.slides.internal.v6g.k5.n5(var2, IEnumerable.class);
         List var6 = new List();

         for (Object var8 : var5) {
            var6.addItem(this.d5.n5(var8, com.aspose.slides.internal.v6g.k5.n5(var1), var3));
         }

         return (T[])var6.toArray();
      }
   }

   private IList l6(Object var1, com.aspose.slides.ms.System.Xml.a3 var2) {
      IList var3 = com.aspose.slides.internal.v6g.k5.n5(var1, IList.class);
      if (var3 != null) {
         Object[] var8 = new Object[var3.size()];

         for (int var9 = 0; var9 < var3.size(); var9++) {
            var8[var9] = this.d5.n5(var3.get_Item(var9), e2, var2);
         }

         return com.aspose.slides.ms.System.u3.n5((Object)(var8));
      } else {
         IEnumerable var4 = com.aspose.slides.internal.v6g.k5.n5(var1, IEnumerable.class);
         ArrayList var5 = new ArrayList();

         for (Object var7 : var4) {
            var5.addItem(this.d5.n5(var7, e2, var2));
         }

         return var5;
      }
   }

   private List<String> d2(String var1) {
      return new List<>(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.Xml.f4.c4(var1)));
   }

   private String n5(IEnumerable var1, com.aspose.slides.ms.System.Xml.a3 var2) {
      com.aspose.slides.internal.l7h.a5 var3 = new com.aspose.slides.internal.l7h.a5();

      for (Object var5 : var1) {
         if (var5 != null) {
            if (var3.l6() != 0) {
               var3.n5(' ');
            }

            var3.n5(this.d5.n5(var5, var2));
         }
      }

      return var3.toString();
   }

   private RuntimeException k5(com.aspose.slides.ms.System.y8 var1, com.aspose.slides.ms.System.y8 var2) {
      return var1 == var2
         ? new InvalidCastException(com.aspose.slides.ms.System.Xml.v3.n5("Xml type 'List of {0}' does not support Clr type '{1}'.", this.k5(), var1.s7()))
         : new InvalidCastException(
            com.aspose.slides.ms.System.Xml.v3.n5(
               "Xml type 'List of {0}' does not support a conversion from Clr type '{1}' to Clr type '{2}'.", this.k5(), var1.s7(), var2.s7()
            )
         );
   }
}
