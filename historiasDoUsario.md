
## Histórias de Usuário

### Cadastro de usuário (cliente):
**Como cliente,**  
quero me cadastrar no sistema fornecendo meus dados pessoais (RG, CPF, Nome, Endereço, Profissão e Renda),  
para poder acessar o sistema e fazer pedidos de aluguel de automóveis.

**Critérios de Aceitação:**
1. O cliente deve fornecer todos os dados obrigatórios (RG, CPF, Nome, Endereço, Profissão e Renda) no formulário de cadastro.
2. O sistema deve validar os campos obrigatórios e exibir mensagens de erro para campos ausentes ou com dados incorretos (ex. formato de CPF).
3. Após o preenchimento correto do formulário, o cliente deve ser cadastrado no sistema e receber uma confirmação de sucesso.
4. O cliente deve poder fazer login no sistema após o cadastro.

### Cadastro de pedido de aluguel:
**Como cliente,**  
quero introduzir um pedido de aluguel de automóvel,  
para iniciar o processo de assinatura e, eventualmente, alugar o veículo desejado.

**Critérios de Aceitação:**
1. O cliente deve ser capaz de selecionar um automóvel e introduzir um pedido de aluguel preenchendo os dados necessários (veículo, duração do contrato, condições).
2. O pedido deve ser salvo no sistema e associado ao perfil do cliente.
3. O sistema deve exibir uma confirmação de sucesso após a criação do pedido.
4. O pedido deve ser visível na área de consulta de pedidos do cliente.

### Modificação de pedido de aluguel:
**Como cliente,**  
quero modificar um pedido de aluguel existente,  
para alterar as condições do contrato ou o automóvel selecionado antes da aprovação.

**Critérios de Aceitação:**
1. O cliente deve ser capaz de editar pedidos de aluguel que ainda não foram aprovados.
2. As alterações permitidas devem incluir a modificação das condições do contrato e a troca do automóvel selecionado.
3. O sistema deve salvar as alterações e exibir uma confirmação de sucesso.
4. O pedido modificado deve ser atualizado na área de consulta de pedidos.

### Consulta de pedidos de aluguel:
**Como cliente,**  
quero consultar meus pedidos de aluguel ativos ou anteriores,  
para acompanhar o status dos meus pedidos e verificar os detalhes dos contratos.

**Critérios de Aceitação:**
1. O cliente deve ser capaz de acessar uma lista com todos os pedidos de aluguel ativos e anteriores.
2. Cada pedido deve exibir informações relevantes, como status do pedido, veículo, condições e datas.
3. O cliente deve poder clicar em um pedido para visualizar seus detalhes completos.
4. O sistema deve permitir filtrar os pedidos por status (ativo, concluído, cancelado).

### Cancelamento de pedido de aluguel:
**Como cliente,**  
quero cancelar um pedido de aluguel,  
para desistir de uma assinatura que ainda não foi aprovada.

**Critérios de Aceitação:**
1. O cliente deve ser capaz de cancelar pedidos de aluguel que ainda não foram aprovados.
2. Após o cancelamento, o pedido deve ser movido para o status "Cancelado" e não deve mais estar disponível para modificação.
3. O sistema deve exibir uma mensagem de confirmação antes de efetuar o cancelamento.
4. O pedido cancelado deve permanecer visível na área de consulta com o status atualizado.

### Avaliação financeira de pedidos:
**Como agente (banco ou empresa),**  
quero avaliar os pedidos de aluguel de automóveis do ponto de vista financeiro,  
para decidir se o contrato pode ser aprovado e, em caso positivo, autorizar sua execução.

**Critérios de Aceitação:**
1. O agente deve ser capaz de acessar a lista de pedidos de aluguel pendentes para avaliação financeira.
2. O sistema deve permitir que o agente avalie os detalhes financeiros, incluindo renda do cliente, preço do automóvel, e prazo de aluguel.
3. O agente deve poder aprovar ou rejeitar o pedido com base na avaliação financeira.
4. O cliente deve ser notificado sobre a decisão de aprovação ou rejeição.

### Modificação de pedido pelos agentes:
**Como agente (banco ou empresa),**  
quero modificar um pedido de aluguel, se necessário,  
para ajustar os detalhes do contrato de acordo com as diretrizes financeiras.

**Critérios de Aceitação:**
1. O agente deve ser capaz de acessar e modificar detalhes do pedido antes da aprovação final.
2. As modificações permitidas devem estar restritas a parâmetros financeiros, como valor de aluguel e condições de pagamento.
3. O sistema deve registrar e salvar todas as alterações feitas pelo agente.
4. O cliente deve ser notificado das modificações realizadas no pedido.

### Registro de propriedade do automóvel:
**Como cliente (contratante),**  
quero ter a opção de comprar o automóvel ao final do contrato de aluguel de longa duração,  
para que o veículo seja registrado em meu nome, caso eu decida comprá-lo.

**Critérios de Aceitação:**
1. O sistema deve permitir que o cliente opte pela compra do automóvel ao final de um contrato de aluguel de longa duração.
2. Se o cliente optar pela compra, o sistema deve gerar um contrato de venda e transferir a propriedade do veículo para o nome do cliente.
3. O sistema deve armazenar e exibir o registro de propriedade do veículo em nome do cliente após a conclusão da compra.
4. O cliente deve ser notificado sobre a conclusão da transferência de propriedade.

### Registro de contrato de crédito/seguro:
**Como agente (banco),**  
quero associar um contrato de crédito ou seguro ao pedido de aluguel,  
para garantir que o cliente tenha a cobertura financeira necessária para o veículo alugado.

**Critérios de Aceitação:**
1. O agente (banco) deve poder associar um contrato de crédito ou seguro a um pedido de aluguel, conforme necessário.
2. O sistema deve validar e salvar o contrato de crédito/seguro junto ao pedido de aluguel.
3. O cliente deve poder visualizar as condições do contrato de crédito/seguro associado ao seu pedido.
4. O contrato de crédito/seguro deve ser incluído na área de gestão de contratos.

### Gestão de contratos:
**Como cliente ou agente,**  
quero acessar a seção de contratos,  
para verificar o andamento e os detalhes dos contratos firmados no sistema.

**Critérios de Aceitação:**
1. O cliente ou agente deve poder acessar uma área dedicada à gestão de contratos.
2. O sistema deve listar todos os contratos ativos e anteriores, exibindo detalhes como o status, veículo, valor e duração do contrato.
3. O cliente ou agente deve poder visualizar os detalhes completos de um contrato específico ao clicar sobre ele.
4. O sistema deve permitir que o cliente ou agente filtre os contratos por status (ativo, concluído, cancelado).
