package com.aspose.slides.internal.s8x;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.z0k.u9;
import com.aspose.slides.ms.System.d1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class n5 implements com.aspose.slides.internal.s9c.k5 {
   private Object n5;

   public n5(String var1) {
      try {
         Class var2 = Class.forName("com.aspose.slides.externaltoolsproxyservice.ExternalToolsProxyServiceSoapClient");
         Method var3 = var2.getDeclaredMethod("getObject");
         this.n5 = var3.invoke(null);
      } catch (ClassNotFoundException var4) {
         var4.printStackTrace();
      } catch (IllegalAccessException var5) {
         var5.printStackTrace();
      } catch (InvocationTargetException var6) {
         var6.printStackTrace();
      } catch (NoSuchMethodException var7) {
         var7.printStackTrace();
      }
   }

   @Override
   public final void n5(String var1) {
      this.n5("verifyXpsConformance", new Class[]{byte[].class}, u9.h0(var1));
   }

   @Override
   public final void n5(String var1, String var2, String var3) {
      byte[] var4 = u9.h0(var1);
      int var5 = (Integer)this.n5("verifyPdfCompliance", new Class[]{byte[].class, String.class, String.class}, var4, var2, var3);
      if (var5 != 0) {
         throw new InvalidOperationException(
            d1.n5("PDF file does not conform to {0}. \r\nFile: {1} \r\nValidator exit code: {2}. \r\nValidator message: {3}", var2, var1, var5, d1.n5)
         );
      }
   }

   @Override
   public final void l6(String var1, String var2, int var3, int var4, int var5, boolean var6) {
      byte[] var7 = (byte[])this.n5(
         "convertPdf2Bmp", new Class[]{byte[].class, int.class, int.class, int.class, boolean.class}, u9.h0(var1), var3, var4, var5, var6
      );
      u9.n5(var2, var7);
   }

   @Override
   public final void n5(String var1, String var2, int var3, int var4, int var5) {
      byte[] var6 = u9.h0(var1);
      byte[] var7 = (byte[])this.n5("convertSwf2Image", new Class[]{byte[].class, int.class, int.class, int.class}, var6, var3, var4, var5);
      u9.n5(var2, var7);
   }

   @Override
   public final void n5(String var1, int var2, String var3, int var4, boolean var5) {
      byte[] var6 = (byte[])this.n5("convertXps2Image", new Class[]{byte[].class, int.class, int.class, boolean.class}, u9.h0(var1), var2, var4, var5);
      u9.n5(var3, var6);
   }

   @Override
   public final boolean l6(String var1) {
      return (Boolean)this.n5("checkPptPresentationByValidator", new Class[]{byte[].class}, u9.h0(var1));
   }

   @Override
   public final void n5(String var1, String var2, int var3, int var4, int var5, boolean var6) {
      throw new NotImplementedException();
   }

   @Override
   public final void n5(String var1, String var2, String var3, int var4, int var5, boolean var6) {
      throw new NotImplementedException();
   }

   private Object n5(String var1, Class[] var2, Object... var3) {
      try {
         Method var4 = this.n5.getClass().getDeclaredMethod(var1, var2);
         var4.setAccessible(true);
         return var4.invoke(this.n5, var3);
      } catch (NoSuchMethodException var5) {
         var5.printStackTrace();
      } catch (InvocationTargetException var6) {
         var6.printStackTrace();
      } catch (IllegalAccessException var7) {
         var7.printStackTrace();
      }

      return new Object();
   }
}
