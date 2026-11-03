package com.aspose.slides.internal.b8c;

import com.aspose.slides.exceptions.ArgumentNullException;

public class r2 extends m9 {
   protected r2(j9e var1) {
      super(var1);
   }

   public static e3m n5(j9e var0) {
      return new r2(var0);
   }

   @Override
   public boolean n5(Object var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      } else {
         com.aspose.slides.ms.System.y8 var2 = com.aspose.slides.ms.System.j8.n5(var1);
         if (var2 == r4) {
            return com.aspose.slides.internal.v6g.k5.u3(var1, boolean.class);
         } else if (var2 == n3) {
            return com.aspose.slides.ms.System.Xml.f4.t2((String)var1);
         } else {
            return var2 == y4 ? ((x6)var1).a6() : com.aspose.slides.internal.v6g.k5.u3(this.l6(var1, r4, null), boolean.class);
         }
      }
   }

   @Override
   public String a6(Boolean var1) {
      return com.aspose.slides.ms.System.Xml.f4.n5(var1.booleanValue());
   }

   @Override
   public String n5(Object var1, com.aspose.slides.ms.System.Xml.a3 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      } else {
         com.aspose.slides.ms.System.y8 var3 = com.aspose.slides.ms.System.j8.n5(var1);
         if (var3 == r4) {
            return com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(var1, boolean.class).booleanValue());
         } else if (var3 == n3) {
            return (String)var1;
         } else {
            return var3 == y4 ? ((x6)var1).c8() : (String)this.l6(var1, n3, var2);
         }
      }
   }

   @Override
   public Object n5(Boolean var1, com.aspose.slides.ms.System.y8 var2) {
      if (var2 == null) {
         throw new ArgumentNullException("destinationType");
      }

      if (var2 == e2) {
         var2 = this.u3();
      }

      if (var2 == r4) {
         return var1;
      } else if (var2 == n3) {
         return com.aspose.slides.ms.System.Xml.f4.n5(var1.booleanValue());
      } else if (var2 == y4) {
         return new x6(this.n5(), var1.booleanValue());
      } else {
         return var2 == k7 ? new x6(this.n5(), var1.booleanValue()) : this.l6(var1, var2, null);
      }
   }

   @Override
   public Object n5(String var1, com.aspose.slides.ms.System.y8 var2, com.aspose.slides.ms.System.Xml.a3 var3) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      if (var2 == null) {
         throw new ArgumentNullException("destinationType");
      }

      if (var2 == e2) {
         var2 = this.u3();
      }

      if (var2 == r4) {
         return com.aspose.slides.ms.System.Xml.f4.t2(var1);
      } else if (var2 == n3) {
         return var1;
      } else if (var2 == y4) {
         return new x6(this.n5(), var1);
      } else {
         return var2 == k7 ? new x6(this.n5(), var1) : this.l6(var1, var2, var3);
      }
   }

   @Override
   public Object n5(Object var1, com.aspose.slides.ms.System.y8 var2, com.aspose.slides.ms.System.Xml.a3 var3) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      if (var2 == null) {
         throw new ArgumentNullException("destinationType");
      }

      com.aspose.slides.ms.System.y8 var4 = com.aspose.slides.ms.System.j8.n5(var1);
      if (var2 == e2) {
         var2 = this.u3();
      }

      if (var2 == r4) {
         return this.n5(var1);
      }

      if (var2 == n3) {
         return this.n5(var1, var3);
      }

      if (var2 == y4) {
         if (var4 == r4) {
            return new x6(this.n5(), com.aspose.slides.internal.v6g.k5.u3(var1, boolean.class));
         }

         if (var4 == n3) {
            return new x6(this.n5(), (String)var1);
         }

         if (var4 == y4) {
            return (x6)var1;
         }
      }

      if (var2 == k7) {
         if (var4 == r4) {
            return new x6(this.n5(), com.aspose.slides.internal.v6g.k5.u3(var1, boolean.class));
         }

         if (var4 == n3) {
            return new x6(this.n5(), (String)var1);
         }

         if (var4 == y4) {
            return (x6)var1;
         }
      }

      return this.l6(var1, var2, var3);
   }
}
