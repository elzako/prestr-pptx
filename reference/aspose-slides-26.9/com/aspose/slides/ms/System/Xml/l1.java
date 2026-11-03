package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.ms.System.IDisposable;

public abstract class l1 implements IDisposable {
   private char[] n5;

   public abstract void t2();

   public abstract void l6(boolean var1);

   public abstract void n5(String var1, String var2, String var3, String var4);

   public final void k5(String var1, String var2) {
      this.n5(null, var1, var2);
   }

   public abstract void n5(String var1, String var2, String var3);

   public final void y4(String var1) {
      this.n5(null, var1, (String)null);
   }

   public abstract void s7();

   public abstract void x8();

   public final void a6(String var1, String var2, String var3) {
      this.u3(null, var1, var2);
      this.l6(var3);
      this.l6();
   }

   public final void u3(String var1, String var2) {
      this.u3(null, var1, (String)null);
      this.l6(var2);
      this.l6();
   }

   public final void l6(String var1, String var2, String var3, String var4) {
      this.u3(var1, var2, var3);
      this.l6(var4);
      this.l6();
   }

   public abstract void u3(String var1, String var2, String var3);

   public abstract void l6();

   public abstract void a6(String var1);

   public abstract void u9(String var1);

   public abstract void n5(String var1, String var2);

   public abstract void k5(String var1);

   public abstract void n5(char var1);

   public abstract void h0(String var1);

   public abstract void l6(String var1);

   public abstract void n5(char var1, char var2);

   public abstract void n5(char[] var1, int var2, int var3);

   public abstract void a_(char[] var1, int var2, int var3);

   public abstract void c8(String var1);

   public abstract void n5(byte[] var1, int var2, int var3);

   public void l6(byte[] var1, int var2, int var3) {
      u3.n5(var1, var2, var3, this);
   }

   public abstract int n3();

   public void a6() {
   }

   public abstract void u9();

   public void t2(String var1) {
      if (var1 != null) {
         this.l6(var1);
      }
   }

   public void n5(c7 var1, boolean var2) {
      if (null == var1) {
         throw new ArgumentNullException("reader");
      }

      if (var1.s7() != 1 && var1.s7() != 17) {
         if (var1.s7() != 2) {
            throw new XmlException("The current position on the Reader is neither an element nor an attribute.", com.aspose.slides.ms.System.d1.n5);
         }

         do {
            if (var2 || !var1.o0()) {
               this.u3(var1.e2(), var1.n3(), var1.y4());

               while (var1.c8()) {
                  if (var1.s7() == 5) {
                     this.k5(var1.x8());
                  } else {
                     this.l6(var1.z1());
                  }
               }

               this.l6();
            }
         } while (var1.u3());
      } else if (var1.k5()) {
         this.n5(var1, var2);
         var1.a6();
      }
   }

   public void l6(c7 var1, boolean var2) {
      if (null == var1) {
         throw new ArgumentNullException("reader");
      }

      boolean var3 = var1.s3();
      int var4 = var1.s7() == 0 ? -1 : var1.t4();

      do {
         switch (var1.s7()) {
            case 1:
               this.n5(var1.e2(), var1.n3(), var1.y4());
               this.n5(var1, var2);
               if (var1.m1()) {
                  this.s7();
               }
            case 2:
            case 6:
            case 9:
            case 11:
            case 12:
            case 16:
            default:
               break;
            case 3:
               if (var3) {
                  if (this.n5 == null) {
                     this.n5 = new char[1024];
                  }

                  int var5;
                  while ((var5 = var1.n5(this.n5, 0, 1024)) > 0) {
                     this.n5(this.n5, 0, var5);
                  }
                  break;
               }

               this.l6(var1.z1());
               break;
            case 4:
               this.a6(var1.z1());
               break;
            case 5:
               this.k5(var1.x8());
               break;
            case 7:
            case 17:
               this.n5(var1.x8(), var1.z1());
               break;
            case 8:
               this.u9(var1.z1());
               break;
            case 10:
               this.n5(var1.x8(), var1.u3("PUBLIC"), var1.u3("SYSTEM"), var1.z1());
               break;
            case 13:
            case 14:
               this.h0(var1.z1());
               break;
            case 15:
               this.x8();
         }
      } while (var1.u9() && (var4 < var1.t4() || var4 == var1.t4() && var1.s7() == 15));
   }

   public final void a6(String var1, String var2) {
      this.u9(var1, null, var2);
   }

   public final void u9(String var1, String var2, String var3) {
      this.k5(var1, var2);
      if (null != var3 && 0 != var3.length()) {
         this.l6(var3);
      }

      this.s7();
   }

   public final void k5(String var1, String var2, String var3, String var4) {
      this.n5(var1, var2, var3);
      if (null != var4 && 0 != var4.length()) {
         this.l6(var4);
      }

      this.s7();
   }

   @Override
   public final void dispose() {
      this.b_(true);
   }

   protected void b_(boolean var1) {
      if (var1 && this.n3() != 5) {
         this.a6();
      }
   }

   public static l1 n5(com.aspose.slides.internal.z0k.t4 var0, y7 var1) {
      if (var1 == null) {
         var1 = new y7();
      }

      return var1.n5(var0);
   }

   public static l1 n5(com.aspose.slides.internal.z0k.a0 var0, y7 var1) {
      if (var1 == null) {
         var1 = new y7();
      }

      return var1.n5(var0);
   }
}
