**Installing Kubernetes on EKS**

**Steps for Installation:**

1.  Installation of AWS CLI on Linux

2.  Configuration of AWS CLI

3.  Install and Configure kubectl

4.  Amazon EKS Cluster IAM role.

5.  Creating a Virtual Private Cloud

6.  Creating the EKS cluster

7.  Create a KubeConfig File

8.  **Installation of AWS CLI on Linux**:

    commands for installing:

    curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o
    "awscliv2.zip"

    unzip awscliv2.zip

    sudo ./aws/install

    aws --version

9.  **Configuration of AWS CLI**:

    aws configure command is the fastest way to setup our configuration

    \$ aws configure

    AWS Access Key ID: \<EXAMPLE\>

    AWS Secret Access Key: \< EXAMPLEKEY\>

    Default region name: \<region-code\>

    Default output format: \<json\>

    The above information will be saved in default profile and will be used
    while we run commands.

10. **Install and Configure kubectl**:

    kubectl is the command line utility which is used for communication with in
    the cluster.

    commands for installing

-   curl -o kubectl
    <https://amazon-eks.s3.us-west-2.amazonaws.com/1.18.8/2020-09-18/bin/linux/amd64/kubectl>

    we can download the latest version from the official website

-   we should give execute permissions to binary

    chmod +x ./kubectl

-   We should move the kubectl to bin folder

    sudo mv ./kubectl /usr/local/bin

-   to verify we can check the version by

    kubectl version --short –client

1.  **Amazon EKS Cluster IAM role**:

-   We should create cluster rule in IAM console

    <https://console.aws.amazon.com/iam/>

-   We should select the roles on the left and click create role button which
    will be at the top of the page

-   From the list of services select EKS service and Permissions at the bottom
    of the page

-   Leave the selected policies as it is and proceed to review page

-   Enter a unique for role and click create role button

-   The IAM role is created.

1.  **Creating a Virtual Private Cloud**:

    We create a separate Virtual Private cloud to protect the communication
    between worker nodes and the master nodes for our cluster. For creating a
    VPC we are going to use Cloud Formation template

-   In AWS open CloudFormation console and click create new stack button

-   On select template page

    select template \> choose a template \> specify an amazon s3 template url

    enter the below link in that box

    <https://amazon-eks.s3.us-west-2.amazonaws.com/cloudformation/2020-08-12/amazon-eks-vpc-private-subnets.yaml>

-   On the specific details page we should fill the parameters like stack name ,
    VPC block and subnets IP

-   on the options page we can the default options as it is

-   On the review page we should click create button to create the VPC

-   we should note the security groups, VPCid , subnet ID’s for further steps

1.  **Creating the EKS cluster**:

-   On the amazon EKS console we should give unique name to our cluster and
    click next step

-   We should select the Kubernetes version

-   We should select EKS role(which we created earlier) in cluster service role
    and click next

-   In the networking section we should select the VPC(which we created earlier)
    and subnets

-   We should select Cluster endpoint access as per our need and click on next.

-   In configure logging section leave the default options as it is and click
    next.

-   On review page, check all the specifications and click on create button.

-   Note that it takes some time for creating the cluster.

-   When its cluster is active we should add the node groups basically they are
    worker nodes. for this in compute section click on add node group button

-   In configure node group console, assign a unique name to node group , select
    the IAM role, subnets , SSH key pair and click om next.

-   In Set Compute Configuration page select the AMI type , instance type and
    disk size and click on next.

-   In Set Scaling Configuration page fill the group size as per our needs.

-   Next review the selected configurations and click on the create button and
    note that it may take few minutes for creating the node group.

1.  **Create a KubeConfig File:**

-   Use Amazon CLI to create or update a kubeconfig for our cluster.

    command:

    aws eks --region \<us-west-2\> update-kubeconfig --name \<cluster_name\>

-   To test our configuration type the command

    kubectl get svc
