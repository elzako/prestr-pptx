package com.aspose.slides;

/** Arguments for one external-resource decision; retain no cross-request state here. */
public interface IResourceLoadingArgs {
   /** URI as stored in the source presentation; redirection does not change it. */
   String getOriginalUri();
   /** Effective URI used when the callback returns ResourceLoadingAction.Default. */
   String getUri();
   /** Redirects Default loading without changing the original URI. */
   void setUri(String value);
   /** Supplies bytes to use when the callback returns ResourceLoadingAction.UserProvided. */
   void setData(byte[] data);
}
