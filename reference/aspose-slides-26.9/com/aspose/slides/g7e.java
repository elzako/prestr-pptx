package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;

class g7e {
   private com.aspose.slides.internal.r7c.c8 n5;
   private com.aspose.slides.internal.r7c.c8 l6;
   private com.aspose.slides.internal.r7c.c8 k5;
   private com.aspose.slides.internal.r7c.c8 u3;
   private final z3h a6;
   private final r8u u9 = new r8u();

   public g7e(z3h var1) {
      if (var1 == null) {
         throw new ArgumentNullException();
      }

      this.a6 = var1;
      if (var1.l6()) {
         this.n5 = new com.aspose.slides.internal.r7c.c8(com.aspose.slides.ms.System.d1.n5("{0}(.*?){1}",new Object[]{ "<p:graphicFrame>", "</p:graphicFrame>"}));
         this.l6 = new com.aspose.slides.internal.r7c.c8(com.aspose.slides.ms.System.d1.n5("{0}(.*?){1}",new Object[]{ "<p:sp>", "</p:sp>"}));
         this.k5 = new com.aspose.slides.internal.r7c.c8(com.aspose.slides.ms.System.d1.n5("{0}{1}{2}",new Object[]{ "<p:cm\\b[^>]*>", "(.*?)", "</p:cm>"}));
         this.u3 = new com.aspose.slides.internal.r7c.c8(com.aspose.slides.ms.System.d1.n5("{0}{1}{2}",new Object[]{ "<p188:cm\\b[^>]*>", "(.*?)", "</p188:cm>"}));
      }
   }

   public final void n5(byte var1, String var2, d3u var3, b9q var4, boolean var5) {
      this.u9.n5(!var5);
      if (!var5) {
         h2d var6 = this.n5(var1, var2, true);
         if (var6 != null) {
            this.n5(var1, var6, var3, var4);
         }
      } else {
         this.n5(var1, var2, var3, var4);
      }
   }

   private h2d n5(byte var1, String var2, boolean var3) {
      if (var1 == 0) {
         throw new InvalidOperationException();
      } else {
         return !var3 || var1 != 3 && var1 != 4 ? this.u9.n5(var1, var2) : this.u9.n5(var1, var2, true);
      }
   }

   private void n5(byte var1, String var2, d3u var3, b9q var4) {
      h2d var5 = new h2d();
      this.n5(var1, var5, var3, var4);
      if (var1 == 3 || var1 == 4 || var1 == 1) {
         List var6 = l1f.n5(var2);
         switch (var1) {
            case 1:
               var3.n5(var4.n5(), var6);
            case 2:
            default:
               break;
            case 3:
               var4.l6().n5(var4.n5(), var6);
               break;
            case 4:
               var4.l6().l6(var4.n5(), var6);
         }
      }
   }

   public final void n5(byte var1, h2d var2, d3u var3, b9q var4) {
      switch (var1) {
         case 1:
            var3.n5(var4.n5(), var1, var2);
            break;
         case 2:
            var4.l6().n5(var4.n5(), var2.n5());
            break;
         case 3:
            var4.l6().l6(var4.n5(), new q8l(var2));
            break;
         case 4:
            var4.l6().n5(var4.n5(), new q8l(var2));
            break;
         case 5:
            var4.l6().k5(var4.n5(), var2.n5());
            break;
         case 6:
            var4.l6().l6(var4.n5(), var2.n5());
            break;
         case 7:
         default:
            throw new ArgumentOutOfRangeException("type", com.aspose.slides.ms.System.s3.n5(e6p.class, var1));
         case 8:
         case 9:
            var4.l6().u3(var4.n5(), var2.n5());
      }
   }

   public final com.aspose.slides.internal.l7h.a5 n5(byte var1, String var2) {
      switch (var1) {
         case 0:
            throw new InvalidOperationException();
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
            return this.n5(var2);
         case 6:
            return this.l6(var2);
         case 7:
         default:
            throw new ArgumentOutOfRangeException("contentType", com.aspose.slides.ms.System.s3.n5(e6p.class, var1), null);
         case 8:
            return this.k5(var2);
         case 9:
            return this.u3(var2);
      }
   }

   private com.aspose.slides.internal.l7h.a5 n5(String var1) {
      return this.n5(d3t.k5, var1);
   }

   private com.aspose.slides.internal.l7h.a5 l6(String var1) {
      return this.n5(d3t.u3, var1);
   }

   private com.aspose.slides.internal.l7h.a5 k5(String var1) {
      return this.l6(d3t.t2, var1);
   }

   private com.aspose.slides.internal.l7h.a5 u3(String var1) {
      return this.l6(d3t.s7, var1);
   }

   private com.aspose.slides.internal.l7h.a5 n5(com.aspose.slides.internal.r7c.c8 var1, String var2) {
      com.aspose.slides.internal.l7h.a5 var3 = new com.aspose.slides.internal.l7h.a5();
      com.aspose.slides.internal.r7c.u3 var4 = this.l6.l6(var2);
      com.aspose.slides.internal.r7c.u3 var5 = this.n5.l6(var2);

      while (var4.u3() || var5.u3()) {
         if (var4.u3()) {
            var3.n5(this.k5(var1, var4.a6().n5(1).k5()));
            var4 = var4.u9();
         } else {
            if (!var5.u3()) {
               throw new InvalidOperationException();
            }

            var3.n5(this.k5(var1, var5.a6().n5(1).k5()));
            var5 = var5.u9();
         }
      }

      return var3.l6() == 0 ? null : var3;
   }

   private com.aspose.slides.internal.l7h.a5 l6(com.aspose.slides.internal.r7c.c8 var1, String var2) {
      com.aspose.slides.internal.l7h.a5 var3 = new com.aspose.slides.internal.l7h.a5();
      com.aspose.slides.internal.r7c.u3 var4 = this.k5.l6(var2);
      com.aspose.slides.internal.r7c.u3 var5 = this.u3.l6(var2);

      while (var4.u3() || var5.u3()) {
         if (var4.u3()) {
            var3.n5(this.k5(var1, var4.a6().n5(1).k5()));
            var4 = var4.u9();
         } else {
            if (!var5.u3()) {
               throw new InvalidOperationException();
            }

            var3.n5(this.k5(var1, var5.a6().n5(1).k5()));
            var5 = var5.u9();
         }
      }

      return var3.l6() == 0 ? null : var3;
   }

   private String k5(com.aspose.slides.internal.r7c.c8 var1, String var2) {
      com.aspose.slides.internal.r7c.u3 var3 = var1.l6(var2);
      if (!var3.u3()) {
         return null;
      }

      com.aspose.slides.internal.l7h.a5 var4 = new com.aspose.slides.internal.l7h.a5();

      while (var3.u3()) {
         var4.n5(var3.a6().n5(1).k5());
         var3 = var3.u9();
      }

      return com.aspose.slides.internal.n8e.w1.n5(var4.toString());
   }
}
