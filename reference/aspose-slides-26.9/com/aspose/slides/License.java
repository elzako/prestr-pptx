package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.DOMResourcesUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public final class License implements ILicense {
   @Override
   public final void setLicense(InputStream stream) throws AsposeLicenseException {
      try {
         ByteArrayInputStream var2 = null;
         if (stream != null) {
            ByteArrayOutputStream var3 = new ByteArrayOutputStream();
            byte[] var4 = new byte[1024];

            int var5;
            while ((var5 = stream.read(var4)) > 0) {
               var3.write(var4, 0, var5);
            }

            var3.flush();
            var2 = new ByteArrayInputStream(var3.toByteArray());
         }

         com.aspose.slides.internal.n8e.w1 var7 = new com.aspose.slides.internal.n8e.w1();
         var7.n5(var2);
      } catch (IOException var6) {
         throw new InvalidOperationException("License stream is not available for reading");
      }
   }

   @Override
   public final void setLicense(String namePath) throws AsposeLicenseException {
      FileInputStream var2 = null;

      try {
         if (null != namePath && !"".equals(namePath)) {
            var2 = new FileInputStream(namePath);
         }

         this.setLicense(var2);
      } catch (FileNotFoundException var9) {
         try {
            String var4 = DOMResourcesUtils.class.getProtectionDomain().getCodeSource().getLocation().getPath();
            if (null != var4) {
               String var5 = URLDecoder.decode(var4, "UTF-8");
               File var6 = new File(var5);
               var2 = new FileInputStream(var6.getParentFile().getPath() + File.separator + namePath);
            }

            this.setLicense(var2);
         } catch (FileNotFoundException var7) {
            throw new InvalidOperationException("License stream is not available for reading");
         } catch (UnsupportedEncodingException var8) {
            throw new InvalidOperationException("License stream is not available for reading");
         }
      }
   }

   public static final String getVersion() {
      return com.aspose.slides.internal.n8e.w1.a6();
   }

   @Override
   public final void resetLicense() {
      com.aspose.slides.internal.n8e.w1.k5();
      com.aspose.slides.internal.n8e.f2.k5();
   }

   @Override
   public final boolean isLicensed() {
      boolean var1 = false;
      Presentation var2 = new Presentation();

      try {
         ISlide var3 = var2.getSlides().addEmptySlide(var2.getLayoutSlides().getByType((byte)11));
         IAutoShape var4 = var3.getShapes().addAutoShape(5, 10.0F, 10.0F, 200.0F, 100.0F);
         var4.getTextFrame().setText(com.aspose.slides.ms.System.d1.n5("", 500, 'a'));
         var1 = var4.getTextFrame().getText().length() == 500;
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }

      return var1;
   }
}
