package com.aspose.slides.internal.f8y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Specialized.StringDictionary;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.SystemException;
import com.aspose.slides.internal.z0k.j5;
import com.aspose.slides.internal.z0k.m3;
import com.aspose.slides.internal.z0k.z1;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.i1;
import com.aspose.slides.ms.System.x9;
import java.io.File;
import java.io.IOException;

public class a6 implements IDisposable {
   private x9 u3 = new x9(-1L);
   private int a6 = 0;
   private boolean u9 = false;
   private boolean h0 = false;
   private u3 c8 = null;
   private i1 t2 = null;
   private x9 s7 = x9.n5;
   private x9 x8 = x9.n5;
   private String n3 = null;
   private a6$n5 y4 = a6$n5.n5(0);
   private boolean e2 = false;
   Process n5 = null;
   private m3 t9 = null;
   private j5 z1 = null;
   private m3 t4 = null;
   private h0 q0 = null;
   public i1 l6 = null;
   public i1 k5 = null;

   private a6(x9 var1, int var2) {
      this.u3 = var1;
      this.a6 = var2;
   }

   public a6() {
   }

   private boolean x8() {
      return this.n5 != null && !this.u3.equals(x9.n5);
   }

   private void n3() {
      if (!this.x8()) {
         throw new InvalidOperationException("Process has not been started.");
      }
   }

   private int n5(x9 var1) {
      this.n3();

      int var2;
      try {
         var2 = this.n5.exitValue();
      } catch (IllegalThreadStateException var4) {
         var2 = 259;
      }

      return var2;
   }

   public int n5() {
      int var1 = this.n5(this.u3);
      if (var1 == 259) {
         throw new InvalidOperationException("The process must exit before getting the requested information.");
      } else {
         return var1;
      }
   }

   private static long n5(int var0, int var1, a6$u3<Integer> var2) {
      throw new InvalidOperationException("Use native API. E.g. GetProcessData() WinApi.");
   }

   public String l6() {
      if (this.n3 == null) {
         this.n3();
         h0 var1 = this.a6();
         this.n3 = var1.u3();
         if (this.n3 == null) {
            throw new InvalidOperationException("Process has exited, so the requested information is not available.");
         }

         if (this.n3.endsWith(".exe") || this.n3.endsWith(".bat") || this.n3.endsWith(".com")) {
            this.n3 = this.n3.substring(0, this.n3.length() - 4);
         }

         int var2 = this.n3.lastIndexOf("\\/");
         if (var2 != -1) {
            this.n3 = this.n3.substring(var2 + 1);
         }
      }

      return this.n3;
   }

   public m3 k5() {
      if (this.t9 == null) {
         throw new InvalidOperationException("Standard error has not been redirected");
      }

      if ((this.y4.n5() & a6$n5.a6.n5()) != 0) {
         throw new InvalidOperationException("Cannot mix asynchronous and synchonous reads.");
      }

      a6$n5 var1 = this.y4;
      a6$n5.n5(var1, a6$n5.n5(var1) | a6$n5.k5.n5());
      return this.t9;
   }

   public m3 u3() {
      if (this.t4 == null) {
         throw new InvalidOperationException("Standard output has not been redirected");
      }

      if ((this.y4.n5() & a6$n5.u3.n5()) != 0) {
         throw new InvalidOperationException("Cannot mix asynchronous and synchonous reads.");
      }

      a6$n5 var1 = this.y4;
      a6$n5.n5(var1, a6$n5.n5(var1) | a6$n5.n5(a6$n5.l6));
      return this.t4;
   }

   public h0 a6() {
      if (this.q0 == null) {
         this.q0 = new h0();
      }

      return this.q0;
   }

   public void n5(h0 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      this.q0 = var1;
   }

   public long u9() {
      int var1 = 0;
      a6$u3 var2 = new a6$u3<>(this, var1);
      long var3 = n5(this.a6, 4, var2);
      var1 = (Integer)var2.n5;
      return var3;
   }

   public void h0() {
      this.dispose();
   }

   @Override
   public void dispose() {
      if (this.n5 != null && !this.e2) {
         this.e2 = true;

         try {
            if (this.n5.getErrorStream() != null) {
               this.n5.getErrorStream().close();
            }

            if (this.n5.getInputStream() != null) {
               this.n5.getInputStream().close();
            }

            if (this.n5.getOutputStream() != null) {
               this.n5.getOutputStream().close();
            }
         } catch (Exception var2) {
            var2.printStackTrace();
         }
      }
   }

   @Override
   protected void finalize() throws Throwable {
      this.dispose();
      super.finalize();
   }

   private static x9 l6(int var0) {
      throw new InvalidOperationException("Use native API.");
   }

   private static int y4() {
      throw new InvalidOperationException("Use native API.");
   }

   public static a6 c8() {
      int var0 = y4();
      x9 var1 = l6(var0);
      if (x9.n5.equals(var1)) {
         throw new SystemException("Can't find current process");
      } else {
         return new a6(var1, var0);
      }
   }

   private static boolean n5(h0 var0, a6 var1) {
      if (var0 == null) {
         throw new ArgumentNullException("startInfo");
      }

      if (var0.u3() == null || var0.u3().length() == 0) {
         throw new InvalidOperationException("File name has not been set");
      }

      if (var0.h0() != null && !var0.a6()) {
         throw new InvalidOperationException("StandardErrorEncoding is only supported when standard error is redirected");
      }

      if (var0.c8() != null && !var0.u9()) {
         throw new InvalidOperationException("StandardOutputEncoding is only supported when standard output is redirected");
      }

      if (var0.t2() && var0.x8() != null && var0.x8().isEmpty()) {
      }

      File var2 = null;
      if (var0.s7() != null && var0.s7().length() > 0 && com.aspose.slides.internal.z0k.u3.k5(var0.s7())) {
         var2 = new File(var0.s7());
      }

      String var3 = var0.u3();
      if (var0.t2()) {
         if (var2 != null) {
            String var4 = com.aspose.slides.internal.z0k.z1.l6(var0.s7(), var0.u3());
            if (com.aspose.slides.internal.z0k.u9.k5(var4)) {
               var3 = var4;
            }
         }
      } else {
         String var10 = com.aspose.slides.internal.z0k.z1.l6(com.aspose.slides.internal.z0k.u3.n5(), var0.u3());
         if (com.aspose.slides.internal.z0k.u9.k5(var10)) {
            var3 = var10;
            if (var2 == null) {
               var2 = new File(com.aspose.slides.internal.z0k.u3.n5());
            }
         }
      }

      if (var0.n5() != null && var0.n5().trim().length() > 0) {
         var3 = var3 + " " + var0.n5();
      }

      String[] var11 = null;
      if (var0.k5()) {
         StringDictionary var5 = var0.l6();
         var11 = new String[var5.getCount()];
         int var6 = 0;

         for (Object var8 : var5.getKeys()) {
            var11[var6++] = var8.toString() + "=" + var5.get_Item(var8.toString()).toString() + ";";
         }
      }

      try {
         var1.n5 = Runtime.getRuntime().exec(n5(var3), var11, var2);
         var1.t9 = new m3(new a6$l6(var1.n5.getErrorStream(), null));
         var1.t4 = new m3(new a6$l6(var1.n5.getInputStream(), null));
         var1.z1 = new j5(new a6$k5(var1.n5.getOutputStream(), null));
         return true;
      } catch (IOException var9) {
         return false;
      }
   }

   private static String[] n5(String var0) {
      List var1 = new List();
      int var2 = 0;
      int var3 = 0;
      int var4 = var3;
      boolean var5 = false;

      while (var2 < var0.length()) {
         char var6 = var0.charAt(var2);
         switch (var6) {
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case ' ':
               if (!var5) {
                  String var7 = var0.substring(var3, var4);
                  if (!"".equals(var7)) {
                     var1.add(var7);
                  }

                  var4 = 0;
                  var3 = 0;
               } else {
                  var4++;
               }
               break;
            case '"':
            case '\'':
               if (!var5 && var3 == 0) {
                  var3 = var2;
                  var4 = var2;
               }

               var4++;
               var5 = !var5;
               break;
            default:
               if (var3 == 0 && var4 == 0) {
                  var3 = var2;
                  var4 = var2;
               }

               var4++;
         }

         var2++;
      }

      if (var3 >= 0 && var4 > var3) {
         String var8 = var0.substring(var3, var4);
         var1.add(var8);
      }

      return (String[])var1.toArray(new String[0]);
   }

   public boolean t2() {
      if (this.x8()) {
         this.l6(this.u3);
         this.u3 = x9.n5;
      }

      return n5(this.a6(), this);
   }

   private void l6(x9 var1) {
      this.n5 = null;
   }

   public static a6 l6(h0 var0) {
      if (var0 == null) {
         throw new ArgumentNullException("startInfo");
      }

      a6 var1 = new a6();
      var1.n5(var0);
      return n5(var0, var1) ? var1 : null;
   }

   public void s7() {
      this.n5(-1);
   }

   public boolean n5(int var1) {
      this.n3();
      int var2 = var1;
      if (var2 == Integer.MAX_VALUE) {
         var2 = -1;
      }

      if (var2 == -1) {
         try {
            this.n5.waitFor();
            return true;
         } catch (InterruptedException var7) {
            var7.printStackTrace();
            return false;
         }
      } else {
         long var4 = System.currentTimeMillis() + var1;

         try {
            while (true) {
               Thread.sleep(10L);

               try {
                  this.n5.exitValue();
                  return true;
               } catch (IllegalThreadStateException var8) {
                  if (System.currentTimeMillis() >= var4) {
                     this.n5.destroy();
                     return false;
                  }
               }
            }
         } catch (InterruptedException var9) {
            com.aspose.slides.internal.f8y.n5.k5(var9.getMessage());
            return false;
         }
      }
   }

   @Override
   public String toString() {
      return super.toString() + " (" + this.l6() + ")";
   }
}
