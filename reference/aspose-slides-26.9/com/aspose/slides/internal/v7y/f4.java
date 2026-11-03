package com.aspose.slides.internal.v7y;

import com.aspose.slides.exceptions.XPathException;

public abstract class f4 extends j9 {
   protected String n5;
   protected String l6;
   protected com.aspose.slides.internal.k4s.h0 u3;
   private e9 a6;

   public f4(String var1, String var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   protected f4(f4 var1) {
      super(var1);
      this.n5 = var1.n5;
      this.l6 = var1.l6;
      this.u3 = var1.u3;
      this.a6 = (e9)l6(var1.a6);
   }

   @Override
   public void t2() {
      if (this.a6 != null) {
         this.a6.t2();
      }
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 k5() {
      if (this.a6 == null) {
         throw XPathException.create("Expression must evaluate to a node-set.");
      }

      if (this.a6.u3() == 0) {
         this.h0();
      }

      return this.a6.k5();
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 h0() {
      if (this.a6 == null) {
         throw XPathException.create("Expression must evaluate to a node-set.");
      } else {
         return this.a6.l6() ? this.a6.k5() : null;
      }
   }

   @Override
   public int u3() {
      return this.a6 != null ? this.a6.u3() : 0;
   }

   protected final Object l6(Object var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, String.class)) {
         return var1;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, Double.class)) {
         return var1;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, Boolean.class)) {
         return var1;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.x6s.a6.class)) {
         return var1;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, Integer.class)) {
         return (double)((Integer)var1).intValue();
      } else if (var1 == null) {
         this.a6 = s4.n5;
         return this;
      } else {
         e9 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, e9.class);
         if (var2 != null) {
            this.a6 = (e9)var2.n5();
            return this;
         } else {
            com.aspose.slides.internal.x6s.h0 var3 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.x6s.h0.class);
            if (var3 != null) {
               this.a6 = new f5(var3);
               return this;
            } else {
               com.aspose.slides.internal.x6s.n5 var4 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.x6s.n5.class);
               if (var4 != null) {
                  return var4.createNavigator();
               } else if (com.aspose.slides.internal.v6g.k5.l6(var1, Short.class)) {
                  return (double)((Short)var1).shortValue();
               } else if (com.aspose.slides.internal.v6g.k5.l6(var1, Long.class)) {
                  return (double)((Long)var1).longValue();
               } else if (com.aspose.slides.internal.v6g.k5.l6(var1, Long.class)) {
                  return (double)((Long)var1 & 4294967295L);
               } else if (com.aspose.slides.internal.v6g.k5.l6(var1, Integer.class)) {
                  return (double)((Integer)var1 & 65535);
               } else if (com.aspose.slides.internal.v6g.k5.l6(var1, Long.class)) {
                  return com.aspose.slides.internal.v6g.k5.t2((Long)var1, 12);
               } else if (com.aspose.slides.internal.v6g.k5.l6(var1, Float.class)) {
                  return (double)((Float)var1).floatValue();
               } else {
                  return com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.ms.System.c4.class)
                     ? com.aspose.slides.internal.v6g.k5.t2((com.aspose.slides.ms.System.c4)var1, 15)
                     : var1.toString();
               }
            }
         }
      }
   }

   protected final String n3() {
      return this.n5.length() != 0 ? com.aspose.slides.ms.System.d1.n5(new String[]{this.n5, ":", this.l6}) : this.l6;
   }

   @Override
   public int a6() {
      return this.a6 == null ? 1 : this.a6.a6();
   }

   @Override
   public int u9() {
      return 5;
   }
}
